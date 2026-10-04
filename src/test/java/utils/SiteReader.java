package utils;

import java.util.List;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SiteReader {

    public static List<String> getSites() {

        InputStream input = SiteReader.class.getClassLoader()
                .getResourceAsStream("data/manga-sites.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        List<String> sites = reader.lines().toList();

        return sites;
    }

    public static void main(String[] args){
        List<String> sites = getSites();

        for (String site:sites){
            System.out.println(site);
        }
    }
}
