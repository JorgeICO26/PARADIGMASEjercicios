package tareas;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
public class XML1 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation =
                    builder.getDOMImplementation();
            Document documento = implementation.createDocument(null,
                    "Curriculum", null);
            documento.setXmlVersion("1.0");
            Element cv = documento.createElement("CurriculumVite");
            Element persona = documento.createElement("Persona");
            Element Nombre = documento.createElement("Nombre");
            Text textNombre = documento.createTextNode("");
                    Nombre.appendChild(textNombre);
            persona.appendChild(Nombre);
            Element FechaNacimiento =
                    documento.createElement("FechaDeNacimiento");
            Text textFecha = documento.createTextNode("25/06/2003");
            FechaNacimiento.appendChild(textFecha);
            persona.appendChild(FechaNacimiento);
            Element direccion = documento.createElement("Direccion");
            Text textdireccion = documento.createTextNode("");
                    direccion.appendChild(textdireccion);
            persona.appendChild(direccion);
            Element telefono = documento.createElement("Telefono");
            Text textTelefono = documento.createTextNode("5544563632");
            telefono.appendChild(textTelefono);
            persona.appendChild(telefono);
            Element correoElectronico =
                    documento.createElement("CorreoElectronico");
            Text textCorreo =
                    documento.createTextNode("jorgerbf22@gmail.com");
            correoElectronico.appendChild(textCorreo);
            persona.appendChild(correoElectronico);
            Element EstudiosRealizados =
                    documento.createElement("EstudiosRealizados");
            Text textEstudios = documento.createTextNode("uni");
                    EstudiosRealizados.appendChild(textEstudios);
            persona.appendChild(EstudiosRealizados);
            Element CentroEducativo =
                    documento.createElement("CentroEducativo");
            Text textCentro = documento.createTextNode("CU atlacomulco");
                    CentroEducativo.appendChild(textCentro);
            persona.appendChild(CentroEducativo);
            Element Idiomas = documento.createElement("Idiomas");
            Text textIdiomas = documento.createTextNode("español");
                    Idiomas.appendChild(textIdiomas);
            persona.appendChild(Idiomas);
            Element Experiencia =
                    documento.createElement("ExperienciaLaboral");
            Text textExperiencia = documento.createTextNode("Ninguna");
            Experiencia.appendChild(textExperiencia);
            persona.appendChild(Experiencia);
            Element DatosInteres =
                    documento.createElement("DatosDeInteres");
            Text textDatosInteres = documento.createTextNode("ninguno");
                    DatosInteres.appendChild(textDatosInteres);
            persona.appendChild(DatosInteres);
            cv.appendChild(persona);
            documento.getDocumentElement().appendChild(cv);
            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("Curriculum.xml"));
            Transformer transformer =
                    TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        } catch (ParserConfigurationException | TransformerException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}