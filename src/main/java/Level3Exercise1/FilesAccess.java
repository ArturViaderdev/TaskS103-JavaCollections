package Level3Exercise1;

import Level3Exercise1.Exceptions.IncorrectCSVFormatException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that read and write CSV file.
 */
public class FilesAccess {
    String csvpath;
    public FilesAccess(String csvpath)
    {
        this.csvpath = csvpath;
    }

    /**
     * Adds a person to the csv file
     * @param person
     * @throws IOException
     */
    public void addPerson(Person person) throws IOException {
        File csvfile = new File(csvpath);
        FileWriter fw;
        BufferedWriter bw;
        if(csvfile.exists() && csvfile.isFile())
        {
            fw = new FileWriter(csvpath,true);
            bw = new BufferedWriter(fw);
            bw.newLine();
        }
        else
        {
            fw = new FileWriter(csvpath,false);
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
     * @return
     * @throws Exception
     */
    public List<Person> readPersons() throws Exception {
        File csvfile = new File(csvpath);

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
