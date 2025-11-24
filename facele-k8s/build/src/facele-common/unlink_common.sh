#! /bin/bash
# Script que reemplaza los enlaces simbólicos en facele_ws, facele_qp y facele_qw
# Autor: G. Sbrugnera
# Version: 2025-09-24

: '
 find . -type l

./src/main/java/com/epidata/facele/ws/arca
./src/main/java/com/epidata/facele/entities
./src/main/java/com/epidata/facele/orm
./src/main/java/com/epidata/facele/tickets
./src/main/java/com/epidata/facele/logger
./src/main/java/com/epidata/facele/conf
./src/main/java/com/epidata/facele/repodriver


./bin/facele.properties
./bin/lib
./bin/templates
./bin/pdfs
./bin/facele_qp.jar

./src/main/java/com/epidata/facele/ws/arca
./src/main/java/com/epidata/facele/entities
./src/main/java/com/epidata/facele/orm
./src/main/java/com/epidata/facele/tickets
./src/main/java/com/epidata/facele/logger
./src/main/java/com/epidata/facele/conf
./src/main/java/com/epidata/facele/etc
./wsdl
./bin/facele.properties
./bin/lib
./bin/wsdl
./bin/facele_qw.jar
'

export COMMAND="cp -Rfv"
export ROOT=/framework
export COMMON=$ROOT/facele_common
export WS=$ROOT/facele_ws
export QP=$ROOT/facele_qp
export QW=$ROOT/facele_qw

# $COMMAND $COMMON/facele.properties $WS/facele.properties
# $COMMAND $COMMON/facele.properties $QP/facele.properties
# $COMMAND $COMMON/facele.properties $QW/facele.properties

# $COMMAND $COMMON/wsdl $WS/
# $COMMAND $COMMON/wsdl $QW/
$COMMAND $COMMON/src_main_java/com_epidata_facele/conf $WS/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/entities $WS/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/logger $WS/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/orm $WS/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/repodriver $WS/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/tickets $WS/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/ws $WS/src/main/java/com/epidata/facele/

$COMMAND $COMMON/src_main_java/com_epidata_facele/conf $QP/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/entities $QP/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/etc $QP/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/logger $QP/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/orm $QP/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/repodriver $QP/src/main/java/com/epidata/facele/

$COMMAND $COMMON/src_main_java/com_epidata_facele/conf $QW/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/entities $QW/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/etc $QW/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/logger $QW/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/orm $QW/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/tickets $QW/src/main/java/com/epidata/facele/
$COMMAND $COMMON/src_main_java/com_epidata_facele/ws $QW/src/main/java/com/epidata/facele/





