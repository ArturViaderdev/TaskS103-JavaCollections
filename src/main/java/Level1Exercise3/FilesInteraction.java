package Level1Exercise3;

import java.io.*;
import java.util.HashMap;

public class FilesInteraction {
    private String countriesfilename;
    private String classificationfilename;

    public FilesInteraction(String countriesfilename,String classificationfilename)
    {
        this.countriesfilename = countriesfilename;
        this.classificationfilename = classificationfilename;
    }

    public void readCountries(HashMap<String, String> data) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String path = classLoader.getResource(countriesfilename).getPath();
        File countriesFile = new File(path);
        FileReader reader = new FileReader(countriesFile);
        BufferedReader br = new BufferedReader(reader);
        String readed;
        do {
            readed=br.readLine();
            if(readed!=null)
            {
                String[] line =readed.split(" ");
                data.put(line[0],line[1]);
            }
        }while(readed != null);

        br.close();
        reader.close();
    }

    public void writeScore(String playerName,int points) throws IOException {
        FileWriter fw = new FileWriter(classificationfilename,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(playerName + " " + Integer.toString(points));
        bw.newLine();
        bw.close();
        fw.close();
    }
}
