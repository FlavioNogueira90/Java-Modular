package digital.innovation.one.utils;

import digital.innovation.one.utils.operacao.interno.DivHelper;
import digital.innovation.one.utils.operacao.interno.MultHelper;
import digital.innovation.one.utils.operacao.interno.SubHelper;
import digital.innovation.one.utils.operacao.interno.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;

    public Calculadora() {
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multHelper = new MultHelper();
        divHelper = new DivHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }
    public int sub(int a, int b){
        return sumHelper.execute(a,b);
    }
    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }
    public int div(int a, int b){
        return divHelper.execute(a,b);
    }

}
