package io.github.aasaru.drools8.section08;

import io.github.aasaru.drools.domain.*;
import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.DataStream;
import org.drools.ruleunits.api.RuleUnitData;

public class RuleUnitSection08 implements RuleUnitData {

  private final DataStream<Passport> passports = DataSource.createStream();
  private final DataStream<FamilyVisaApplication> familyVisaApplications = DataSource.createStream();

  private final DataStore<Visa> visas = DataSource.createStore();
  private final DataStore<InvalidPassport> invalidPassports = DataSource.createStore();
  private final DataStore<InvalidFamilyVisaApplication> invalidFamilyVisaApplications = DataSource.createStore();

  public DataStream<Passport> getPassports() {
    return passports;
  }

  public DataStream<FamilyVisaApplication> getFamilyVisaApplications() {
    return familyVisaApplications;
  }

  public DataStore<InvalidPassport> getInvalidPassports() {
    return invalidPassports;
  }

  public DataStore<InvalidFamilyVisaApplication> getInvalidFamilyVisaApplications() {
    return invalidFamilyVisaApplications;
  }

  public DataStore<Visa> getVisas() {
    return visas;
  }


}