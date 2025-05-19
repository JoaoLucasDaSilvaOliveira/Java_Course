package N26;

import java.util.Arrays;

public class Photo {

    private Photo (String type, int seqNumber, int year, String city, String extension){
        this.type = type;
        this.seqNumber = seqNumber;
        this.year = year;
        this.city = city;
        this.extension = extension;
    }

    private final String type;
    private final int seqNumber;
    private final int year;
    private final String city;
    private final String extension;

    public static Photo create(String photoPure){
        if (photoPure.matches("(IMG|VID)_\\d+-\\d{4}-[a-zA-Z_]+\\.[a-zA-Z]{0,3}")){
            String[] spl = photoPure.split("[\\-.]");
            String splCod = spl[0].replaceAll("\\D", ""); //retorna o cógigo da imagem
            String splIMG = spl[0].replaceAll("[\\d_\\-.]", ""); //retorna o prefixo do arquivo
            return new Photo(splIMG, Integer.parseInt(splCod), Integer.parseInt(spl[1]), spl[2].replaceAll("_", " "), spl[3]);
        }
        throw new IllegalArgumentException("Formato inesperado");
    }

    public String getType() {
        return type;
    }

    public int getSeqNumber() {
        return seqNumber;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "type='" + type + '\'' +
                ", seqNumber=" + seqNumber +
                ", year=" + year +
                ", city='" + city + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
