package pe.joedayz.libreria.servicios;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.ws.WebFault;

@WebFault(
      targetNamespace = "http://pe.joedayz.libreria.servicios/excepciones/",
      name = "UsuarioNoAutorizado")
public class UsuarioNoAutorizadoException extends Exception {

   private static final long serialVersionUID = 1L;

   public UsuarioNoAutorizadoException() {
   }

   public UsuarioNoAutorizadoException(String message) {
      super(message);
   }

   public UsuarioNoAutorizadoException(Throwable cause) {
      super(cause);
   }

   public UsuarioNoAutorizadoException(String message, Throwable cause) {
      super(message, cause);
   }

   public UsuarioNoAutorizadoException(String message, Throwable cause,
         boolean enableSuppression, boolean writableStackTrace) {
      super(message, cause, enableSuppression, writableStackTrace);
   }

   public UsuarioFaultInfo getFaultInfo() {
      return new UsuarioFaultInfo(getMessage());
   }

   @XmlAccessorType(XmlAccessType.FIELD)
   public static class UsuarioFaultInfo {

      @XmlAttribute
      private String mensagem;

      private Date data;

      public UsuarioFaultInfo(String mensagem) {
         this.mensagem = mensagem;
         this.data = new Date();

      }

      public UsuarioFaultInfo() {
      }

      public Date getData() {
         return data;
      }

   }

}
