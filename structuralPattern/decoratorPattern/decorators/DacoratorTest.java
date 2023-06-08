package structuralPattern.decoratorPattern.decorators;

import org.junit.Test;

public class DacoratorTest {

    @Test
    public void DocoTest() {
        String salaryRecord = "name\nYoungWook";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecord);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("input");
        System.out.println(salaryRecord);
        System.out.println("encoded");
        System.out.println(plain.readData());
        System.out.println("decoded");
        System.out.println(encoded.readData());
    }
}
