package com.epidata.facele.repodriver;

import io.minio.BucketExistsArgs;
import io.minio.GetObjectArgs;
import io.minio.GetObjectResponse;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 *
 * @author gustavo
 */
public class MinIORepoDriver extends AbstractRepoDriver {

    private MinioClient m_minioClient;

    private String m_bucket;
    private String m_url;
    private String m_user;
    private String m_pass;

    private MinioClient getMinioClient() throws Exception {

        if (m_minioClient == null) {
            m_minioClient = MinioClient.builder()
                    .endpoint(m_url)
                    .credentials(m_user, m_pass)
                    .build();
        } // end if

        boolean l_found = m_minioClient.bucketExists(
                BucketExistsArgs.builder().bucket(m_bucket).build());
        if (!l_found) {
            m_minioClient.makeBucket(MakeBucketArgs.builder()
                    .bucket(m_bucket).build());
        } // end if

        return m_minioClient;
    }

    public MinIORepoDriver(String p_pdfDir) {
        super(p_pdfDir);
    }

    @Override
    public byte[] downloadFile(String p_fileName) throws Exception {

        GetObjectArgs l_args = GetObjectArgs.builder().bucket(m_bucket).object(
                getPdfDir() + p_fileName).build();
        GetObjectResponse l_response = getMinioClient().getObject(l_args);

        return l_response.readAllBytes();

    }

    public String getBucket() {
        return m_bucket;
    }

    public void setBucket(String p_bucket) {
        this.m_bucket = p_bucket;
    }

    public String getUrl() {
        return m_url;
    }

    public void setUrl(String p_url) {
        this.m_url = p_url;
    }

    public String getUser() {
        return m_user;
    }

    public void setUser(String p_user) {
        this.m_user = p_user;
    }

    public String getPass() {
        return m_pass;
    }

    public void setPass(String p_pass) {
        this.m_pass = p_pass;
    }

    @Override
    public void uploadFile(byte[] p_content, String p_fileName) throws Exception {

        InputStream l_inputStream = new ByteArrayInputStream(p_content);

        getMinioClient().putObject(
                PutObjectArgs.builder()
                        .bucket(m_bucket)
                        .object(getPdfDir() + p_fileName)
                        .stream(l_inputStream, p_content.length, -1)
                        .build());

    }

}
