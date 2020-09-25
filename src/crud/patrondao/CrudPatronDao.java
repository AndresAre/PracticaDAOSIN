
package crud.patrondao;



import Clases.PersonaDAO;
import Clases.PersonaDTO;

public class CrudPatronDao {

  
    public static void main(String[] args) {
       PersonaDAO pd=new PersonaDAO();
       PersonaDTO pdt=new PersonaDTO("Sebastian","Salgado","323345342");
      // System.out.println(pd.registrarPersona(pdt));
       
       for (PersonaDTO p:pd.ListarTodos()) {
           System.out.println("Nombre:"+p.getNombre()+"-"+"Apellido:"+p.getApellido()+"-"+"Telefono:"+p.getTelefono());
            
       }
       
    
    }
}
