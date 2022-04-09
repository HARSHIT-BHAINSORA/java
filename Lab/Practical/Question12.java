// upcasting in java :

class Bank {

    float getRateOfInterest() {
        return 10f;
    }

}

class PNB extends Bank {

    float getRateOfInterest() {
        return 4.5f;
    }

}

class SBI extends Bank {

    float getRateOfInterest() {
        return 5f;
    }

}

class HDFC extends Bank {

    float getRateOfInterest() {
        return 4f;
    }

}

class Main {

    public static void main(String args[]) {
        Bank obj;
        obj = new SBI();
        System.out.println(obj.getRateOfInterest());
        obj = new HDFC();
        System.out.println(obj.getRateOfInterest());
        obj = new PNB();
        System.out.println(obj.getRateOfInterest());
    }

}
