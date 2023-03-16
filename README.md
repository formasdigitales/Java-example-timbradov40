#Java-example-timbradov40

Ejemplo de timbrado CFDI 4.0 con Java

# Requerimientos
* Java 1.8
* Netbeans 11+ (Opcional)

# Estructura de proyecto
- com.formasdigitales.timbrado40_ejemplo
  - principal
    - Principal.java
  - procesaxml
    - ProcesaXML.java
    - Timbradoxml.java
  - ws
    - Accesos.java
    - Acuse.java
    - WSTimbradoCFDIService
    - WSTimbradoCFDI

En el proyecto se encuentra la clase Principal.java la cual ejecuta los métodos necesarios
para poder cambiar la fecha del documento, obtener el numero del certificado y el certificado 
del emisor y colocarlos en el documento.

```java
	
public class Principal {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, FileNotFoundException, CertificateException, 	TransformerException, GeneralSecurityException {
        ProcesaXML procesaXML = new ProcesaXML();
        File xml = new File("src/main/resources/cfdi_v40_generico.xml");
        File ceritifcate = new File("src/main/resources/ESCUELA_KEMPER_URGATE_EKU9003173C9.cer");
        File privateKey = new File("src/main/resources/ESCUELA_KEMPER_URGATE_EKU9003173C9.key");
        procesaXML.readXML(xml,ceritifcate,privateKey);
    }
}

```

* La variable xml tiene cargado el documento con el que deseamos realizar el timbrado.
* La variable certificate tiene asignado el archivo .cer del emisor con el que haremos la prueba.
* La variable privateKey tiene cargado el archivo .key de nuestro emisor.

En la clase ProcesaXML.java se tienen los métodos necesarios para obtener el numero de certificado y el certificado en base64
y enviárselo al xml además de tener el método de generarCadenaOriginal el cual es necesario para poder usar el método de 
generarSello y colocarlo en el documento.

En la clase Timbradoxml.java sera la clase que permitirá realizar el envió del documento al webservice para su timbrado, en caso de algún error 
este nos responderá con el código y descripción del error en caso contrario nos responderá con el xml timbrado.
