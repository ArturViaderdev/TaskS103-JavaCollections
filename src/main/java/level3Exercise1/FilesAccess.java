package level3Exercise1;

import level3Exercise1.exceptions.IncorrectCSVFormatException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilesAccess {
    String csvPath;
    public FilesAccess(String csvPath)
    {
        this.csvPath = csvPath;
    }

    public void addPerson(Person person) throws IOException {
        File csvfile = new File(csvPath);


        if(csvfile.exists() && csvfile.isFile())
        {
            try(FileWriter fw = new FileWriter(csvPath,true);
            BufferedWriter bw = new BufferedWriter(fw))
            {
                bw.newLine();
                bw.write(person.toCSVLine());
            }

        }
        else
        {
            try(FileWriter fw = new FileWriter(csvPath,false);
            BufferedWriter bw = new BufferedWriter(fw))
            {
                bw.write("\"Nom\",\"Cognoms\",\"Nif\"");
                bw.newLine();
                bw.write(person.toCSVLine());
            }
        }
    }

    public List<Person> readPersons() throws IOException,IncorrectCSVFormatException {
        File csvfile = new File(csvPath);
            try(FileReader reader = new FileReader(csvfile);
                BufferedReader br = new BufferedReader(reader))
            {
                String read;
                read =br.readLine();
                List<Person> persons = new ArrayList<>();
                do {
                    read =br.readLine();
                    if(read !=null)
                    {
                        String[] data = read.split(",");
                        if(data.length==3)
                        {
                            persons.add(new Person(data[0],data[1],data[2]));
                        }
                        else
                        {
                            throw new IncorrectCSVFormatException();
                        }
                    }
                }while(read != null);
                return persons;
            }
    }
}
