package hw9;

import java.util.Random;

public class Comp {

    private static final Random random = new Random();

    public static VarOfChoice randomChoice(){

        return VarOfChoice.values()[random.nextInt(VarOfChoice.values().length)];
    }

}