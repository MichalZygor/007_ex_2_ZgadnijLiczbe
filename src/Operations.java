public class Operations {
    final int minNumber;
    final int maxNumber;
    final int aliquotNumber;

    public Operations(int minNumber, int maxNumber, int aliquotNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.aliquotNumber = aliquotNumber;
    }

    public boolean checkNumber(int number) {
        if(number >= minNumber && number <= maxNumber && number % aliquotNumber == 0){
            System.out.println("Trafiłeś! Podana liczba jest podzielna przez " + aliquotNumber + " oraz należy do przedziału "
                 + "liczb <" + minNumber + "," + maxNumber + ">");
            return false;
        } else if (number >= minNumber && number <= maxNumber){
            System.out.println("Blisko. Niestety podana liczba nie jest podzielna przez " + aliquotNumber);
            return true;
        }else if(number < minNumber){
            System.out.println("Podana liczba jest za mała");
            return true;
        }else {
            System.out.println("Podana liczba jest za duża");
            return true;
        }
    }
}
