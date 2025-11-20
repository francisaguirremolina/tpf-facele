
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.FEAuthRequest;
import com.epidata.facele.ws.arca.wsfev1.FERecuperaLastCbteResponse;
import java.io.FileReader;
import java.util.Properties;

/**
 *
 * @author gustavo
 */
public class Test1 {

    public static void main(String[] args) throws Exception {
        System.out.println("Test1");

        String l_sign = "CY96723NOKClfsK9OQfSBTrYOG48DF62kuPqFiAsTBnIGJAcM0LRbfP2fLf+lZO6ARzdA4q+4FXSGUjx60MNDWPDYoHjy7JDBp2NuZLq+6JroigeUYFH2pUgw9OQ6c6zdtPp6BRL+/dlthXg0bJ+3BzQmDQaj49UAwaopO6cPEQ=";
        String l_token = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/Pgo8c3NvIHZlcnNpb249IjIuMCI+CiAgICA8aWQgc3JjPSJDTj13c2FhaG9tbywgTz1BRklQLCBDPUFSLCBTRVJJQUxOVU1CRVI9Q1VJVCAzMzY5MzQ1MDIzOSIgZHN0PSJDTj13c2ZlLCBPPUFGSVAsIEM9QVIiIHVuaXF1ZV9pZD0iNjkxMjc4NzAiIGdlbl90aW1lPSIxNzQ3Mzk3Mjk0IiBleHBfdGltZT0iMTc0NzQ0MDU1NCIvPgogICAgPG9wZXJhdGlvbiB0eXBlPSJsb2dpbiIgdmFsdWU9ImdyYW50ZWQiPgogICAgICAgIDxsb2dpbiBlbnRpdHk9IjMzNjkzNDUwMjM5IiBzZXJ2aWNlPSJ3c2ZlIiB1aWQ9IkM9YXIsIE89cHVudG9zeXMsIFNFUklBTE5VTUJFUj1DVUlUIDIwMjE2MzMwODQ3LCBDTj1wdW50b3N5cyIgYXV0aG1ldGhvZD0iY21zIiByZWdtZXRob2Q9IjIyIj4KICAgICAgICAgICAgPHJlbGF0aW9ucz4KICAgICAgICAgICAgICAgIDxyZWxhdGlvbiBrZXk9IjIwMjE2MzMwODQ3IiByZWx0eXBlPSI0Ii8+CiAgICAgICAgICAgIDwvcmVsYXRpb25zPgogICAgICAgIDwvbG9naW4+CiAgICA8L29wZXJhdGlvbj4KPC9zc28+Cg==";
        FEAuthRequest l_auth = new FEAuthRequest();
        l_auth.setCuit(20216330847l);
        l_auth.setSign(l_sign);
        l_auth.setToken(l_token);
        Properties l_props = new Properties();
        l_props.load(new FileReader("facele_qw.properties"));
        GlobalConf l_conf = new GlobalConf(l_props);
        
        ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

        FERecuperaLastCbteResponse l_lastCbtResponse
                = l_serviceOperations.getWSFESoap()
                        .feCompUltimoAutorizado(l_auth, 2, 11);

        System.out.println("#### nro: " + l_lastCbtResponse.getCbteNro());
    }

}
