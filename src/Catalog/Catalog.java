package Catalog;

public class Catalog {

    public static String catalog(String s, String article) {

        String result = "";

        String[] lines = s.split("\n");

        for (String line : lines) {
            if (line.contains(article)) {
                result += "\n" + getCatalog(line);
            }
        }

        if (result.length() == 0) {
            return "Nothing";
        }

        return result.substring(1);

    }

    public static String getCatalog(String s) {

        String result = "";

        String myLine;

        int count = 0;


        myLine = s.substring(12);
        for (int i = 0; i < myLine.length(); i++) {
            if (myLine.charAt(i) != '<') {
                result += myLine.charAt(i);
                count++;
            } else {
                myLine = myLine.substring(12 + count);
                count = 0;
                result += " > prx: $";
                for (int j = 0; j < myLine.length(); j++) {
                    if (myLine.charAt(j) != '<') {
                        result += myLine.charAt(j);
                        count++;
                    } else {
                        myLine = myLine.substring(11 + count);
                        result += " qty: ";
                        for (int k = 0; k < myLine.length(); k++) {
                            if (myLine.charAt(k) != '<') {
                                result += myLine.charAt(k);
                            }
                            else {
                                return result;
                            }
                        }
                    }
                }
            }
        }

        return "null";

    }

    public static void main(String[] args) {

        String s = """
                <prod><name>drill</name><prx>99</prx><qty>5</qty></prod>
                                
                <prod><name>hammer</name><prx>10</prx><qty>50</qty></prod>
                                
                <prod><name>screwdriver</name><prx>5</prx><qty>51</qty></prod>
                                
                <prod><name>table saw</name><prx>1099.99</prx><qty>5</qty></prod>
                                
                <prod><name>saw</name><prx>9</prx><qty>10</qty></prod>
                                
                <prod><name>chair</name><prx>100</prx><qty>20</qty></prod>
                                
                <prod><name>fan</name><prx>50</prx><qty>8</qty></prod>
                                
                <prod><name>wire</name><prx>10.8</prx><qty>15</qty></prod>
                                
                <prod><name>battery</name><prx>150</prx><qty>12</qty></prod>
                                
                <prod><name>pallet</name><prx>10</prx><qty>50</qty></prod>
                                
                <prod><name>wheel</name><prx>8.80</prx><qty>32</qty></prod>
                                
                <prod><name>extractor</name><prx>105</prx><qty>17</qty></prod>
                                
                <prod><name>bumper</name><prx>150</prx><qty>3</qty></prod>
                                
                <prod><name>ladder</name><prx>112</prx><qty>12</qty></prod>
                                
                <prod><name>hoist</name><prx>13.80</prx><qty>32</qty></prod>
                                
                <prod><name>platform</name><prx>65</prx><qty>21</qty></prod>
                                
                <prod><name>car wheel</name><prx>505</prx><qty>7</qty></prod>
                                
                <prod><name>bicycle wheel</name><prx>150</prx><qty>11</qty></prod>
                                
                <prod><name>big hammer</name><prx>18</prx><qty>12</qty></prod>
                                
                <prod><name>saw for metal</name><prx>13.80</prx><qty>32</qty></prod>
                                
                <prod><name>wood pallet</name><prx>65</prx><qty>21</qty></prod>
                                
                <prod><name>circular fan</name><prx>80</prx><qty>8</qty></prod>
                                
                <prod><name>exhaust fan</name><prx>62</prx><qty>8</qty></prod>
                                
                <prod><name>cattle prod</name><prx>990</prx><qty>2</qty></prod>
                                
                <prod><name>window fan</name><prx>62</prx><qty>8</qty></prod>
                 """;
        System.out.println(catalog(s, "fan"));
    }

}
