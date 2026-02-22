package Level3Exercise1;

import java.io.*;

public class FilesAccess {
    String csvpath;
    public FilesAccess(String csvpath)
    {
        this.csvpath = csvpath;
    }

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
        }
        bw.write(person.toCSVLine());
        bw.close();
        fw.close();
    }
}
