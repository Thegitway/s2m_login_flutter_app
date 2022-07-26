package com.s2m.gbmagent.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.google.gson.annotations.SerializedName;
import com.s2m.gbmagent.database.converters.BeneficiariesConverter;
import com.s2m.gbmagent.database.converters.EquipmentsConverter;
import com.s2m.gbmagent.database.converters.InstitutionCurrenciesConverter;
import com.s2m.gbmagent.database.converters.ProfileCurrencyConverter;
import com.s2m.gbmagent.database.converters.SecretQuestionConverter;
import com.s2m.gbmagent.database.converters.SecretQuestionListConverter;
import com.s2m.gbmagent.database.converters.StringListConverter;
import com.s2m.gbmagent.utils.Config.Global;
import com.s2m.gbmagent.utils.Tools;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static com.s2m.gbmagent.utils.Tools.filter;

/**
 * Created by S2M on 2020-02-20.
 */
@Entity(tableName = "user")
public class User implements Serializable {

    @SerializedName("idUser")
    @PrimaryKey(autoGenerate = true)
    private Long idUser;

    @SerializedName("id")
    @ColumnInfo(name = "id")
    private String agentId;

    @SerializedName("type")
    @ColumnInfo(name = "type")
    private String type;


    @SerializedName("language")
    @ColumnInfo(name = "language")
    private String language;


    @SerializedName("secretQuestion")
    @ColumnInfo(name = "secretQuestion")
    @TypeConverters(SecretQuestionConverter.class)
    private SecretQuestion secretQuestion;

    @SerializedName("addAdr1")
    @ColumnInfo(name = "addAdr1")
    private String addAdr1;

    @SerializedName("addAdr2")
    @ColumnInfo(name = "addAdr2")
    private String addAdr2;

    @SerializedName("postalCode")
    @ColumnInfo(name = "postalCode")
    private String postalCode;

    @SerializedName("city")
    @ColumnInfo(name = "city")
    private String city;

    @SerializedName("firstName")
    @ColumnInfo(name = "firstName")
    private String firstName;

    @SerializedName("lastName")
    @ColumnInfo(name = "lastName")
    private String lastName;

    @SerializedName("email")
    @ColumnInfo(name = "email")
    private String email;

    @SerializedName("nationality")
    @ColumnInfo(name = "nationality")
    private String nationality;

    @SerializedName("defaultAccount")
    @ColumnInfo(name = "defaultAccount")
    private String defaultAccount;

    @SerializedName("defaultCurrency")
    @ColumnInfo(name = "defaultCurrency")
    private String defaultCurrency;

    @SerializedName("attempCounter")
    @ColumnInfo(name = "attempCounter")
    private int attempCounter;

    @SerializedName("deviceStatus")
    @ColumnInfo(name = "deviceStatus")
    private String deviceStatus;

    @SerializedName("terminalNumber")
    @ColumnInfo(name = "terminalNumber")
    private String terminalNumber;

    @SerializedName("pinEntryIndicator")
    @ColumnInfo(name = "pinEntryIndicator")
    private Boolean pinEntryIndicator;

    @SerializedName("phone")
    @ColumnInfo(name = "phone")
    private String phone;

    @SerializedName("login")
    @ColumnInfo(name = "login")
    private String login;


    @SerializedName("photoUrl")
    @ColumnInfo(name = "photoUrl")
    private String photoUrl;

    @SerializedName("equipementList")
    @ColumnInfo(name = "equipementList")
    @TypeConverters(EquipmentsConverter.class)
    private List<Equipment> equipmentList;

    @SerializedName("firstLoginInd")
    @ColumnInfo(name = "firstLoginInd")
    private Boolean firstLoginInd;

    @SerializedName("tokenLifetime")
    @ColumnInfo(name = "tokenLifetime")
    private Double tokenLifetime;

    @SerializedName("secretQuestionList")
    @ColumnInfo(name = "secretQuestionList")
    @TypeConverters(SecretQuestionListConverter.class)
    private List<SecretQuestion> secretQuestionList;

    /*@SerializedName("beneficiaries")
    @ColumnInfo(name = "beneficiaries")
    @TypeConverters(BeneficiariesConverter.class)
    private List<Beneficiary> beneficiariesList;*/



    @SerializedName("profileCurrencies")
    @ColumnInfo(name = "profileCurrencies")
    @TypeConverters(ProfileCurrencyConverter.class)
    private List<ProfileCurrency> profileCurrencies;


    @SerializedName("multipleWalletIndicator")
    @ColumnInfo(name = "multipleWalletIndicator")
    private String multipleWalletIndicator;

    @SerializedName("pullNotifPeriodicity")
    @ColumnInfo(name = "pullNotifPeriodicity")
    private Double pullNotifPeriodicity;

    @SerializedName("nbrUnreadALerts")
    @ColumnInfo(name = "nbrUnreadALerts")
    private String nbrUnreadALerts;

    @SerializedName("beneficiaryList")
    @ColumnInfo(name = "beneficiaryList")
    @TypeConverters(BeneficiariesConverter.class)
    private List<Beneficiary> beneficiaryList;

    @SerializedName("mcc")
    @ColumnInfo(name = "mcc")
    private String mcc;

    @SerializedName("country")
    @ColumnInfo(name = "country")
    private String country;

    @SerializedName("countryCode")
    @ColumnInfo(name = "countryCode")
    private String countryCode;

    //to modify
    @SerializedName("status")
    @ColumnInfo(name = "status")
    private String status;

    @SerializedName("level")
    @ColumnInfo(name = "level")
    private String level;

    @SerializedName("longitude")
    @ColumnInfo(name = "longitude")
    private String longitude;

    @SerializedName("latitude")
    @ColumnInfo(name = "latitude")
    private String latitude;

    @SerializedName("linkCardTemp")
    @ColumnInfo(name = "linkCardTemp")
    private String linkCardTemp;

    @SerializedName("linkCardBalanceTemp")
    @ColumnInfo(name = "linkCardBalanceTemp")
    private Double linkCardBalanceTemp;

    @SerializedName("displayBalance")
    @ColumnInfo(name = "displayBalance")
    private boolean displayBalance;

    @SerializedName("linkCardCurrency")
    @ColumnInfo(name = "linkCardCurrency")
    private String linkCardCurrency;

    @SerializedName("linkedPersoWallet")
    @ColumnInfo(name = "linkedPersoWallet")
    @TypeConverters(EquipmentsConverter.class)
    private List<Equipment> linkedPersoWallet = new ArrayList<>();


    @SerializedName("services")
    @ColumnInfo(name = "services")
    @TypeConverters(StringListConverter.class)
    private List<String> services = new ArrayList<>();



    @SerializedName("institutionCurrencies")
    @ColumnInfo(name = "institutionCurrencies")
    @TypeConverters(InstitutionCurrenciesConverter.class)
    private List<InstitutionCurrency> institutionCurrencies = new ArrayList<>();


    @SerializedName("allowCreateOperator")
    @ColumnInfo(name = "allowCreateOperator")
    private Boolean allowCreateOperator;


//    public boolean HAS_WALLET = false;
//    public boolean HAS_CARD = false;
//    public boolean HAS_BANK_ACCOUNT = false;



    public boolean getDisplayBalance() {
        return displayBalance;
    }

    public void setDisplayBalance(boolean displayBalance) {
        this.displayBalance = displayBalance;
    }

    public boolean hasEquipementByType(String equipment_type){
        Tools.Predicate<Equipment> validPredicate = item -> item.getType().equalsIgnoreCase(equipment_type);
        List<Equipment> equipments = (List<Equipment>) filter(equipmentList, validPredicate);
        return !equipments.isEmpty();
    }
    public boolean hasActiveEquipementByType(String equipment_type){
        Tools.Predicate<Equipment> validPredicate = item -> (item.getStatus() == 1 && item.getType().equalsIgnoreCase(equipment_type)  );
        List<Equipment> equipments = (List<Equipment>) filter(equipmentList, validPredicate);
        return !equipments.isEmpty();
    }

    public List<Equipment> getActiveEquipementByType(String equipment_type){
        Tools.Predicate<Equipment> validPredicate = item -> (item.getStatus() == 1 && item.getType().equalsIgnoreCase(equipment_type)  );
        List<Equipment> equipments = (List<Equipment>) filter(equipmentList, validPredicate);
        return equipments;
    }


    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String id) {
        this.agentId = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public SecretQuestion getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(SecretQuestion secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getAddAdr1() {
        return addAdr1;
    }

    public void setAddAdr1(String addAdr1) {
        this.addAdr1 = addAdr1;
    }

    public String getAddAdr2() {
        return addAdr2;
    }

    public void setAddAdr2(String addAdr2) {
        this.addAdr2 = addAdr2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDefaultAccount() {
        return defaultAccount;
    }

    public void setDefaultAccount(String defaultAccount) {
        this.defaultAccount = defaultAccount;
    }

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public int getAttempCounter() {
        return attempCounter;
    }

    public void setAttempCounter(int attempCounter) {
        this.attempCounter = attempCounter;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public Boolean getPinEntryIndicator() {
        return pinEntryIndicator;
    }

    public void setPinEntryIndicator(Boolean pinEntryIndicator) {
        this.pinEntryIndicator = pinEntryIndicator;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }



    public Boolean getFirstLoginInd() {
        return firstLoginInd;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public void setFirstLoginInd(Boolean firstLoginInd) {
        this.firstLoginInd = firstLoginInd;
    }

    public Double getTokenLifetime() {
        return tokenLifetime;
    }

    public void setTokenLifetime(Double tokenLifetime) {
        this.tokenLifetime = tokenLifetime;
    }

    public List<SecretQuestion> getSecretQuestionList() {
        return secretQuestionList;
    }

    public void setSecretQuestionList(List<SecretQuestion> secretQuestionList) {
        this.secretQuestionList = secretQuestionList;
    }

   /* public List<Beneficiary> getBeneficiariesList() {
        return beneficiariesList;
    }

    public void setBeneficiariesList(List<Beneficiary> beneficiariesList) {
        this.beneficiariesList = beneficiariesList;
    }*/

    public List<ProfileCurrency> getProfileCurrencies() {
        return profileCurrencies;
    }

    public void setProfileCurrencies(List<ProfileCurrency> profileCurrencies) {
        this.profileCurrencies = profileCurrencies;
    }

    public String getMultipleWalletIndicator() {
        return multipleWalletIndicator;
    }

    public void setMultipleWalletIndicator(String multipleWalletIndicator) {
        this.multipleWalletIndicator = multipleWalletIndicator;
    }

    public Double getPullNotifPeriodicity() {
        return pullNotifPeriodicity;
    }

    public void setPullNotifPeriodicity(Double pullNotifPeriodicity) {
        this.pullNotifPeriodicity = pullNotifPeriodicity;
    }

    public String getNbrUnreadALerts() {
        return nbrUnreadALerts;
    }

    public void setNbrUnreadALerts(String nbrUnreadALerts) {
        this.nbrUnreadALerts = nbrUnreadALerts;
    }

    public List<Beneficiary> getBeneficiaryList() {
        return beneficiaryList;
    }

    public void setBeneficiaryList(List<Beneficiary> beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

//    public Long getLinkCardTemp() {
//        return linkCardTemp;
//    }
//
//    public void setLinkCardTemp(Long linkCardTemp) {
//        this.linkCardTemp = linkCardTemp;
//    }


    public String getLinkCardTemp() {
        return linkCardTemp;
    }

    public void setLinkCardTemp(String linkCardTemp) {
        this.linkCardTemp = linkCardTemp;
    }

    public Double getLinkCardBalanceTemp() {
        return linkCardBalanceTemp;
    }

    public void setLinkCardBalanceTemp(Double linkCardBalanceTemp) {
        this.linkCardBalanceTemp = linkCardBalanceTemp;
    }


    public String getLinkCardCurrency() {
        return linkCardCurrency;
    }

    public void setLinkCardCurrency(String linkCardCurrency) {
        this.linkCardCurrency = linkCardCurrency;
    }

    public List<Equipment> getLinkedPersoWallet() {
        return linkedPersoWallet;
    }

    public void setLinkedPersoWallet(List<Equipment> linkedPersoWallet) {
        this.linkedPersoWallet = linkedPersoWallet;
    }

    public void addLinedPersoWallet(Equipment equipment){
        this.linkedPersoWallet.add(equipment);
    }

    public List<InstitutionCurrency> getInstitutionCurrencies() {
        return institutionCurrencies;
    }

    public void setInstitutionCurrencies(List<InstitutionCurrency> institutionCurrencies) {
        this.institutionCurrencies = institutionCurrencies;
    }

    public Boolean getAllowCreateOperator() {
        return allowCreateOperator;
    }

    public void setAllowCreateOperator(Boolean allowCreateOperator) {
        this.allowCreateOperator = allowCreateOperator;
    }


    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }



    public void hideWalletBalance(){
        for (Equipment eq : equipmentList){
            if(eq.getType().equals(Global.WALLET_TYPE)){
                eq.setShowBalance(false);
            }
        }

    }
}
