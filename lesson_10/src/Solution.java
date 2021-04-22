import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class Solution {
    public static void main(String[] args) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource("D:\\Programming\\dev\\java_course_FreeIT\\lesson_10\\computer_parts.xsd"));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource("D:\\Programming\\dev\\java_course_FreeIT\\lesson_10\\computer_parts.xml"));
            System.out.println(true);
        } catch (Exception ex) {
            System.out.println(false + ex.getMessage());
        }

    }
}
