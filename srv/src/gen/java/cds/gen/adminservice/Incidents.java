package cds.gen.adminservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

/**
 * Incidents created by Customers.
 */
@CdsName("AdminService.Incidents")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-24T10:31:50.709062657Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Incidents extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String CUSTOMER = "customer";

  String CUSTOMER_ID = "customer_ID";

  String TITLE = "title";

  String URGENCY = "urgency";

  String URGENCY_CODE = "urgency_code";

  String STATUS = "status";

  String STATUS_CODE = "status_code";

  String CONVERSATION = "conversation";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  Instant getCreatedAt();

  void setCreatedAt(Instant createdAt);

  /**
   * Canonical user ID
   */
  String getCreatedBy();

  /**
   * Canonical user ID
   */
  void setCreatedBy(String createdBy);

  Instant getModifiedAt();

  void setModifiedAt(Instant modifiedAt);

  /**
   * Canonical user ID
   */
  String getModifiedBy();

  /**
   * Canonical user ID
   */
  void setModifiedBy(String modifiedBy);

  Customers getCustomer();

  void setCustomer(Map<String, ?> customer);

  @CdsName(CUSTOMER_ID)
  String getCustomerId();

  @CdsName(CUSTOMER_ID)
  void setCustomerId(String customerId);

  String getTitle();

  void setTitle(String title);

  Urgency getUrgency();

  void setUrgency(Map<String, ?> urgency);

  @CdsName(URGENCY_CODE)
  String getUrgencyCode();

  @CdsName(URGENCY_CODE)
  void setUrgencyCode(String urgencyCode);

  Status getStatus();

  void setStatus(Map<String, ?> status);

  @CdsName(STATUS_CODE)
  String getStatusCode();

  @CdsName(STATUS_CODE)
  void setStatusCode(String statusCode);

  List<Conversation> getConversation();

  void setConversation(List<Conversation> conversation);

  Incidents_ ref();

  static Incidents create() {
    return Struct.create(Incidents.class);
  }

  static Incidents of(Map<String, Object> map) {
    return Struct.access(map).as(Incidents.class);
  }

  static Incidents create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(Incidents.class);
  }

  interface Conversation extends CdsData {
    String ID = "ID";

    String TIMESTAMP = "timestamp";

    String AUTHOR = "author";

    String MESSAGE = "message";

    @CdsName(ID)
    String getId();

    @CdsName(ID)
    void setId(String id);

    Instant getTimestamp();

    void setTimestamp(Instant timestamp);

    /**
     * Canonical user ID
     */
    String getAuthor();

    /**
     * Canonical user ID
     */
    void setAuthor(String author);

    String getMessage();

    void setMessage(String message);

    static Conversation create() {
      return Struct.create(Conversation.class);
    }

    static Conversation of(Map<String, Object> map) {
      return Struct.access(map).as(Conversation.class);
    }
  }
}
