package ejercicios.ejercicio_de_acceso_datos;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;

    }

    public static void escribirXML(ArrayList<Alumno> listaProductos) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document documento = null;
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation dom = builder.getDOMImplementation();
            documento = dom.createDocument(null, "xml", null);

            Element raiz = documento.createElement("Productos");
            documento.getDocumentElement().appendChild(raiz);
            Element nodoProducto = null, nodoDatos = null;
            Text texto = null;
            for (Alumno producto : listaProductos) {
                nodoProducto = documento.createElement("Producto");
                raiz.appendChild(nodoProducto);
                nodoDatos = documento.createElement("nombre");
                nodoProducto.appendChild(nodoDatos);
                nodoDatos.setAttribute("nacionalidad", "española");
                texto = documento.createTextNode(producto.getNombre());
                nodoDatos.appendChild(texto);
                nodoDatos = documento.createElement("precio");
                nodoProducto.appendChild(nodoDatos);
                texto = documento.createTextNode(String.valueOf(producto.getNota()));
                nodoDatos.appendChild(texto);
            }
            Source source = new DOMSource(documento);
            Result resultado = new StreamResult(new File("archivo.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, resultado);
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerConfigurationException tce) {
            tce.printStackTrace();
        } catch (TransformerException te) {
            te.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Alumno("Juan", 90));
        listaAlumnos.add(new Alumno("Maria", 85));
        listaAlumnos.add(new Alumno("Pedro", 78));

        Alumno.escribirXML(listaAlumnos);

        System.out.println("Archivo XML creado con éxito!");
    }

}
