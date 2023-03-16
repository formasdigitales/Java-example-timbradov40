package com.formasdigitales.timbrado40_ejemplo.procesaxml;

import com.formasdigitales.timbrado40_ejemplo.ws.Accesos;
import com.formasdigitales.timbrado40_ejemplo.ws.AcuseCFDI;
import com.formasdigitales.timbrado40_ejemplo.ws.TimbrarCFDI;
import com.formasdigitales.timbrado40_ejemplo.ws.WSTimbradoCFDI;
import com.formasdigitales.timbrado40_ejemplo.ws.WSTimbradoCFDIService;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Jonathan
 */
public class Timbradoxml {
  
  private static String USUARIO = "pruebasWS";
  private static String PASSWORD = "pruebasWS";
  
  public String timbradoxml(String comprobante) throws MalformedURLException{
    Accesos accesos = new Accesos();
    
    accesos.setUsuario(USUARIO);
    accesos.setPassword(PASSWORD);
    
    WSTimbradoCFDIService wstimbradoservice = new WSTimbradoCFDIService(new URL("http://dev33.facturacfdi.mx/WSTimbradoCFDIService?wsdl"));
    
    WSTimbradoCFDI wstimbradocfdi =  wstimbradoservice.getWSTimbradoCFDIPort();
    wstimbradocfdi.timbrarCFDI(accesos, USUARIO);
    AcuseCFDI acuse = wstimbradocfdi.timbrarCFDI(accesos, comprobante);
    
    if(acuse.getXmlTimbrado() == null || acuse.getXmlTimbrado().isEmpty()){
      System.out.println("error: " + acuse.getCodigoError() + " - " + acuse.getError());
    }
      return acuse.getXmlTimbrado();
  }
}
