package cds.gen.processorservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;
import java.time.Instant;
import javax.annotation.processing.Generated;

@CdsName("ProcessorService.DraftAdministrativeData")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-24T10:31:50.709062657Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface DraftAdministrativeData_ extends StructuredType<DraftAdministrativeData_> {
  String DRAFT_UUID = "DraftUUID";

  String CREATION_DATE_TIME = "CreationDateTime";

  String CREATED_BY_USER = "CreatedByUser";

  String DRAFT_IS_CREATED_BY_ME = "DraftIsCreatedByMe";

  String LAST_CHANGE_DATE_TIME = "LastChangeDateTime";

  String LAST_CHANGED_BY_USER = "LastChangedByUser";

  String IN_PROCESS_BY_USER = "InProcessByUser";

  String DRAFT_IS_PROCESSED_BY_ME = "DraftIsProcessedByMe";

  String CDS_NAME = "ProcessorService.DraftAdministrativeData";

  @CdsName(DRAFT_UUID)
  ElementRef<String> DraftUUID();

  @CdsName(CREATION_DATE_TIME)
  ElementRef<Instant> CreationDateTime();

  @CdsName(CREATED_BY_USER)
  ElementRef<String> CreatedByUser();

  @CdsName(DRAFT_IS_CREATED_BY_ME)
  ElementRef<Boolean> DraftIsCreatedByMe();

  @CdsName(LAST_CHANGE_DATE_TIME)
  ElementRef<Instant> LastChangeDateTime();

  @CdsName(LAST_CHANGED_BY_USER)
  ElementRef<String> LastChangedByUser();

  @CdsName(IN_PROCESS_BY_USER)
  ElementRef<String> InProcessByUser();

  @CdsName(DRAFT_IS_PROCESSED_BY_ME)
  ElementRef<Boolean> DraftIsProcessedByMe();
}
