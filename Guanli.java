package work;

public class Guanli {
	public static StringBuffer Read(){
        String str1 = "";
        StringBuffer str2 = new StringBuffer(str1);
        try {
            File file = new File("C:\\Java\\File\\B.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fr);
            while ((str1 =bReader.readLine()) != null) {
                str2.append(str1);
            }
            fr.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

}
	 public static void Write(StringBuffer s){
	        try{
	            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Java\\File\\A.txt"));
	            bw.write(s.toString());
	            bw.close();
	        }catch (IOException e){
	        }
	    }

	    public static int getCharMaps(String z,StringBuffer s) {
	        boolean p;
	        int w = 0;
	        String a = s.toString();
	        char[] b = a.toCharArray();
	        for (int i = 0; i < a.length(); i++) {
	            String x = String.valueOf(b[i]);
	            p = z.equals(x);
	            if(p == true){
	                w = w + 1;
	            }

	        }
	        return w;
	    }
}