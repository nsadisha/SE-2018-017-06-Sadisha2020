package boxClass;

public class Box {
    private int L1;
    private int W1;
    private int H1;
    private int Weight;

    public Box(){
        this.L1 = 0;
        this.W1 = 0;
        this.H1 = 0;
        this.Weight = 0;
    }
    public Box(int L,int W, int H, int Weight){
        this.L1 = L;
        this.W1 = W;
        this.H1 = H;
        this.Weight = Weight;
    }

    int calculateVolume(){
        return this.L1* this.W1* this.H1;
    }
    double calculateDensity(){
        int vol = this.calculateVolume();
        return this.Weight/ (double) vol;
    }

    public static void main(String[] args) {
        Box box = new Box(10, 5, 5, 2600);

        int volume = box.calculateVolume();
        double density = box.calculateDensity();

        System.out.println("Volume of the box: " + volume);
        System.out.println("Density of the box: " + density);

    }
}
