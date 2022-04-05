// upcasting in java :

class Bank{

    float getRoi()
    {
        return 10f;
    }

}

class PNB extends Bank{

    float getRoi()
    {
        return 4.5f;
    }

}

class SBI extends Bank
{

    float getRoi()
    {
        return 5f;
    }

}
class HDFC extends Bank{

    float getRoi()
    {
        return 4f;
    }

}

class Main{
    Bank obj; // obj of bank
    obj = new SBI(); // ref of SBI class (upcasting)
    System.out,println(obj.getRoi()); // SBI class
    obj = new HDFC();
    System.out,println(obj.getRoi());
    obj = new PNB();
    System.out,println(obj.getRoi());

}
