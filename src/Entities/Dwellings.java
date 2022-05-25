package Entities;

public class Dwellings {

    private Integer qtyStow;
    private Integer qtyInduct;

    public Dwellings() {
    }

    public int CalcDwellings(int stow, int induct) {
        return getQtyStow() - getQtyInduct();
    }

    public Integer getQtyStow() {
        return qtyStow;
    }

    public void setQtyStow(Integer qtyStow) {
        this.qtyStow = qtyStow;
    }

    public Integer getQtyInduct() {
        return qtyInduct;
    }

    public void setQtyInduct(Integer qtyInduct) {
        this.qtyInduct = qtyInduct;
    }

    public Dwellings(Integer qtyStow, Integer qtyInduct) {
        this.qtyStow = qtyStow;
        this.qtyInduct = qtyInduct;
    }



}