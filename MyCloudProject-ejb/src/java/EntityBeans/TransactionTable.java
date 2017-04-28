/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityBeans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author code_eagle
 */
@Entity
@Table(name = "transaction_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionTable.findAll", query = "SELECT t FROM TransactionTable t")
    , @NamedQuery(name = "TransactionTable.findByTransactionId", query = "SELECT t FROM TransactionTable t WHERE t.transactionId = :transactionId")
    , @NamedQuery(name = "TransactionTable.findByUserIdFrom", query = "SELECT t FROM TransactionTable t WHERE t.userIdFrom = :userIdFrom")
    , @NamedQuery(name = "TransactionTable.findByUserIdTo", query = "SELECT t FROM TransactionTable t WHERE t.userIdTo = :userIdTo")
    , @NamedQuery(name = "TransactionTable.findByAmount", query = "SELECT t FROM TransactionTable t WHERE t.amount = :amount")
    , @NamedQuery(name = "TransactionTable.findByDateTime", query = "SELECT t FROM TransactionTable t WHERE t.dateTime = :dateTime")
    , @NamedQuery(name = "TransactionTable.findByPaymentMode", query = "SELECT t FROM TransactionTable t WHERE t.paymentMode = :paymentMode")
    , @NamedQuery(name = "TransactionTable.findByCurrentStatus", query = "SELECT t FROM TransactionTable t WHERE t.currentStatus = :currentStatus")})
public class TransactionTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transaction_id")
    private Integer transactionId;
    @Column(name = "user_id_from")
    private Integer userIdFrom;
    @Column(name = "user_id_to")
    private Integer userIdTo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @Column(name = "date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    @Size(max = 256)
    @Column(name = "payment_mode")
    private String paymentMode;
    @Size(max = 256)
    @Column(name = "current_status")
    private String currentStatus;

    public TransactionTable() {
    }

    public TransactionTable(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getUserIdFrom() {
        return userIdFrom;
    }

    public void setUserIdFrom(Integer userIdFrom) {
        this.userIdFrom = userIdFrom;
    }

    public Integer getUserIdTo() {
        return userIdTo;
    }

    public void setUserIdTo(Integer userIdTo) {
        this.userIdTo = userIdTo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionTable)) {
            return false;
        }
        TransactionTable other = (TransactionTable) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityBeans.TransactionTable[ transactionId=" + transactionId + " ]";
    }
    
}
