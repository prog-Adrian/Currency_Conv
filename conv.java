package converter;

public class conv {
    String[] curr_names;
    double[] curr_rates;

    public conv(){
        curr_names = new String[] {"USD", "GBP", "JPY", "PHP"};
        curr_rates =  new double[]{1, 0.73,102.60, 48.06};
    }
    public float convert(String curr, float amt){
        int rate_index = -1;
        for(int i = 0; i < curr_names.length;i++){
            if(curr.equals(this.curr_names[i])){
                rate_index = i;
            }
        }
        float result = (float) this.curr_rates[rate_index] * (float) amt; 
        return result;
    }
}
