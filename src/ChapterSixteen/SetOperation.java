package ChapterSixteen;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    SetOperation setOperation;
    Set<Integer> setListA= new HashSet<>();
    Set<Integer> setListB= new HashSet<>();

    public SetOperation(SetOperation setOperation) {
        this.setOperation = setOperation;
    }
    public SetOperation(){

    }

    public SetOperation getSetOperation() {
        return setOperation;
    }

//    public void setSetOperation(SetOperation setOperation) {
//        this.setOperation = setOperation;
//    }

    public Set<Integer> containListOfSetA(int firstNumber, int secondNumber, int thirdNumber) {
        firstNumber = 2;
        secondNumber = 4;
        thirdNumber = 3;
        setListA.add(firstNumber);
        setListA.add(secondNumber);
        setListA.add(thirdNumber);
        System.out.println(setListA);
return setListA;

    }

    public int countA() {
      return   setListA.size();

    }
    public int countB() {
      return   setListB.size();

    }


    public Set<Integer> containListOfSetB(int firstNumber, int secondNumber, int thirdNumber) {
        firstNumber=7;
        secondNumber=8;
        thirdNumber=3;
        setListB.add(firstNumber);
        setListB.add(secondNumber);
        setListB.add(thirdNumber);
        System.out.println(setListB);
        return setListB;
    }

    public Set<Integer> canPerfomInteractionMethod(Set setListA) {
        Set<Integer> intersectSet=new HashSet<>(setListA);
        intersectSet.retainAll(setListB);
        return intersectSet;
            }



    }


