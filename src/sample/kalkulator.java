package sample;

public enum kalkulator {
    DODAWANIE{
        public double dzialanie(double x, double y){
            return x+y;
        }
    },
    ODEJMOWANIE{
        public double dzialanie(double x, double y){
            return x-y;
        }
    },
    MNOZENIE{
        public double dzialanie(double x, double y){
            return x*y;
        }
    },
    DZIELENIE{
        public double dzialanie(double x, double y){
            return x/y;
        }
    };

    public abstract  double dzialanie(double x, double y);
}
