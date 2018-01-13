package security.bercy.com.week6fridaytest.Model;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Bercy on 1/12/18.
 */


public class funds implements Serializable {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("InvestmentName")
    @Expose
    private String investmentName;
    @SerializedName("Agency")
    @Expose
    private String agency;
    private final static long serialVersionUID = 2188906791027825185L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvestmentName() {
        return investmentName;
    }

    public void setInvestmentName(String investmentName) {
        this.investmentName = investmentName;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

}




