package level3Exercise1;

import level3Exercise1.exceptions.IncorrectCSVFormatException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that read and write CSV file.
 */
public class FilesAccess {
    String csvPath;
    public FilesAccess(String csvPath)
    {
        this.csvPath = csvPath;
    }

    /**
     * Adds a person to the csv file
     * @param person Person to add
     * @throws IOException Exception
     */
    public void addPerson(Person person) throws IOException {
        File csvfile = new File(csvPath);
        FileWriter fw;
        BufferedWriter bw;
        if(csvfile.exists() && csvfile.isFile())
        {
            fw = new FileWriter(csvPath,true);
            bw = new BufferedWriter(fw);
            bw.newLine();
        }
        else
        {
            fw = new FileWriter(csvPath,false);
            bw = new BufferedWriter(fw);
            bw.write("\"Nom\",\"Cognoms\",\"Nif\"");
            bw.newLine();
        }
        bw.write(person.toCSVLine());
        bw.close();
        fw.close();
    }

    /**
     * Reads the persons from the csv file
     * @return List of persons
     * @throws Exception error
     */
    public List<Person> readPersons() throws Exception {
        File csvfile = new File(csvPath);

            FileReader reader = new FileReader(csvfile);
            BufferedReader br = new BufferedReader(reader);
            String readed;
            readed=br.readLine();
            List<Person> persons = new ArrayList<>();
            do {
                readed=br.readLine();
                if(readed!=null)
                {
                    String[] dats =readed.split(",");
                    if(dats.length==3)
                    {
                        persons.add(new Person(dats[0],dats[1],dats[2]));
                    }
                    else
                    {
                        throw new IncorrectCSVFormatException();
                    }
                }
            }while(readed != null);
            br.close();
            reader.close();
            return persons;
    }
}
