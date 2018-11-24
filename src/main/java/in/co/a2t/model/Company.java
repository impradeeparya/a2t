package in.co.a2t.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compamy")
public class Company {

  @Id
  @Column(name = "company_id")
  private Long id;
  @Column(name = "company_name")
  private String name;
  @Column(name = "company_add1")
  private String address1;
  @Column(name = "company_add2")
  private String address2;
  @Column(name = "company_city")
  private String city;
  @Column(name = "emp_count")
  private int count;
  @Column(name = "nature_of_buss")
  private String natureOfBuss;
  @Column(name = "company_url")
  private String url;
  @Column(name = "company_board_no")
  private int boardNumber;
  @Column(name = "signed_on")
  private Date signedOn;
  @Column(name = "revenue_turnover")
  private int revenueTurnover;
  @Column(name = "company_desc")
  private String description;
  @Column(name = "company_logo")
  private String logo;
  @ManyToOne
  @JoinColumn(name = "industry_id")
  private Institute institute;

  public Long getId() {
    return id;
  }

  public Company setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Company setName(String name) {
    this.name = name;
    return this;
  }

  public String getAddress1() {
    return address1;
  }

  public Company setAddress1(String address1) {
    this.address1 = address1;
    return this;
  }

  public String getAddress2() {
    return address2;
  }

  public Company setAddress2(String address2) {
    this.address2 = address2;
    return this;
  }

  public String getCity() {
    return city;
  }

  public Company setCity(String city) {
    this.city = city;
    return this;
  }

  public int getCount() {
    return count;
  }

  public Company setCount(int count) {
    this.count = count;
    return this;
  }

  public String getNatureOfBuss() {
    return natureOfBuss;
  }

  public Company setNatureOfBuss(String natureOfBuss) {
    this.natureOfBuss = natureOfBuss;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public Company setUrl(String url) {
    this.url = url;
    return this;
  }

  public int getBoardNumber() {
    return boardNumber;
  }

  public Company setBoardNumber(int boardNumber) {
    this.boardNumber = boardNumber;
    return this;
  }

  public Date getSignedOn() {
    return signedOn;
  }

  public Company setSignedOn(Date signedOn) {
    this.signedOn = signedOn;
    return this;
  }

  public int getRevenueTurnover() {
    return revenueTurnover;
  }

  public Company setRevenueTurnover(int revenueTurnover) {
    this.revenueTurnover = revenueTurnover;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Company setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getLogo() {
    return logo;
  }

  public Company setLogo(String logo) {
    this.logo = logo;
    return this;
  }

  public Institute getInstitute() {
    return institute;
  }

  public Company setInstitute(Institute institute) {
    this.institute = institute;
    return this;
  }
}
