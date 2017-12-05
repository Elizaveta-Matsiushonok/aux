// ORM class for table 'weather'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Dec 04 08:40:45 UTC 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class weather extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("stationId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        stationId = (String)value;
      }
    });
    setters.put("date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date = (java.sql.Date)value;
      }
    });
    setters.put("tmin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tmin = (Integer)value;
      }
    });
    setters.put("tmax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tmax = (Integer)value;
      }
    });
    setters.put("snow", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        snow = (Integer)value;
      }
    });
    setters.put("snwd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        snwd = (Integer)value;
      }
    });
    setters.put("prcp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        prcp = (Integer)value;
      }
    });
  }
  public weather() {
    init0();
  }
  private String stationId;
  public String get_stationId() {
    return stationId;
  }
  public void set_stationId(String stationId) {
    this.stationId = stationId;
  }
  public weather with_stationId(String stationId) {
    this.stationId = stationId;
    return this;
  }
  private java.sql.Date date;
  public java.sql.Date get_date() {
    return date;
  }
  public void set_date(java.sql.Date date) {
    this.date = date;
  }
  public weather with_date(java.sql.Date date) {
    this.date = date;
    return this;
  }
  private Integer tmin;
  public Integer get_tmin() {
    return tmin;
  }
  public void set_tmin(Integer tmin) {
    this.tmin = tmin;
  }
  public weather with_tmin(Integer tmin) {
    this.tmin = tmin;
    return this;
  }
  private Integer tmax;
  public Integer get_tmax() {
    return tmax;
  }
  public void set_tmax(Integer tmax) {
    this.tmax = tmax;
  }
  public weather with_tmax(Integer tmax) {
    this.tmax = tmax;
    return this;
  }
  private Integer snow;
  public Integer get_snow() {
    return snow;
  }
  public void set_snow(Integer snow) {
    this.snow = snow;
  }
  public weather with_snow(Integer snow) {
    this.snow = snow;
    return this;
  }
  private Integer snwd;
  public Integer get_snwd() {
    return snwd;
  }
  public void set_snwd(Integer snwd) {
    this.snwd = snwd;
  }
  public weather with_snwd(Integer snwd) {
    this.snwd = snwd;
    return this;
  }
  private Integer prcp;
  public Integer get_prcp() {
    return prcp;
  }
  public void set_prcp(Integer prcp) {
    this.prcp = prcp;
  }
  public weather with_prcp(Integer prcp) {
    this.prcp = prcp;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof weather)) {
      return false;
    }
    weather that = (weather) o;
    boolean equal = true;
    equal = equal && (this.stationId == null ? that.stationId == null : this.stationId.equals(that.stationId));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.tmin == null ? that.tmin == null : this.tmin.equals(that.tmin));
    equal = equal && (this.tmax == null ? that.tmax == null : this.tmax.equals(that.tmax));
    equal = equal && (this.snow == null ? that.snow == null : this.snow.equals(that.snow));
    equal = equal && (this.snwd == null ? that.snwd == null : this.snwd.equals(that.snwd));
    equal = equal && (this.prcp == null ? that.prcp == null : this.prcp.equals(that.prcp));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof weather)) {
      return false;
    }
    weather that = (weather) o;
    boolean equal = true;
    equal = equal && (this.stationId == null ? that.stationId == null : this.stationId.equals(that.stationId));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.tmin == null ? that.tmin == null : this.tmin.equals(that.tmin));
    equal = equal && (this.tmax == null ? that.tmax == null : this.tmax.equals(that.tmax));
    equal = equal && (this.snow == null ? that.snow == null : this.snow.equals(that.snow));
    equal = equal && (this.snwd == null ? that.snwd == null : this.snwd.equals(that.snwd));
    equal = equal && (this.prcp == null ? that.prcp == null : this.prcp.equals(that.prcp));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.stationId = JdbcWritableBridge.readString(1, __dbResults);
    this.date = JdbcWritableBridge.readDate(2, __dbResults);
    this.tmin = JdbcWritableBridge.readInteger(3, __dbResults);
    this.tmax = JdbcWritableBridge.readInteger(4, __dbResults);
    this.snow = JdbcWritableBridge.readInteger(5, __dbResults);
    this.snwd = JdbcWritableBridge.readInteger(6, __dbResults);
    this.prcp = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.stationId = JdbcWritableBridge.readString(1, __dbResults);
    this.date = JdbcWritableBridge.readDate(2, __dbResults);
    this.tmin = JdbcWritableBridge.readInteger(3, __dbResults);
    this.tmax = JdbcWritableBridge.readInteger(4, __dbResults);
    this.snow = JdbcWritableBridge.readInteger(5, __dbResults);
    this.snwd = JdbcWritableBridge.readInteger(6, __dbResults);
    this.prcp = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(stationId, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(date, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(tmin, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tmax, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(snow, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(snwd, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(prcp, 7 + __off, 4, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(stationId, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(date, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(tmin, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(tmax, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(snow, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(snwd, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(prcp, 7 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.stationId = null;
    } else {
    this.stationId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date = null;
    } else {
    this.date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tmin = null;
    } else {
    this.tmin = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tmax = null;
    } else {
    this.tmax = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.snow = null;
    } else {
    this.snow = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.snwd = null;
    } else {
    this.snwd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.prcp = null;
    } else {
    this.prcp = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.stationId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stationId);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.date.getTime());
    }
    if (null == this.tmin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tmin);
    }
    if (null == this.tmax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tmax);
    }
    if (null == this.snow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.snow);
    }
    if (null == this.snwd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.snwd);
    }
    if (null == this.prcp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.prcp);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.stationId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stationId);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.date.getTime());
    }
    if (null == this.tmin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tmin);
    }
    if (null == this.tmax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.tmax);
    }
    if (null == this.snow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.snow);
    }
    if (null == this.snwd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.snwd);
    }
    if (null == this.prcp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.prcp);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(stationId==null?"null":stationId, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":"" + date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tmin==null?"null":"" + tmin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tmax==null?"null":"" + tmax, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(snow==null?"null":"" + snow, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(snwd==null?"null":"" + snwd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prcp==null?"null":"" + prcp, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(stationId==null?"null":stationId, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":"" + date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tmin==null?"null":"" + tmin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tmax==null?"null":"" + tmax, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(snow==null?"null":"" + snow, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(snwd==null?"null":"" + snwd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(prcp==null?"null":"" + prcp, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stationId = null; } else {
      this.stationId = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date = null; } else {
      this.date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tmin = null; } else {
      this.tmin = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tmax = null; } else {
      this.tmax = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.snow = null; } else {
      this.snow = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.snwd = null; } else {
      this.snwd = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.prcp = null; } else {
      this.prcp = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stationId = null; } else {
      this.stationId = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date = null; } else {
      this.date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tmin = null; } else {
      this.tmin = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tmax = null; } else {
      this.tmax = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.snow = null; } else {
      this.snow = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.snwd = null; } else {
      this.snwd = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.prcp = null; } else {
      this.prcp = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    weather o = (weather) super.clone();
    o.date = (o.date != null) ? (java.sql.Date) o.date.clone() : null;
    return o;
  }

  public void clone0(weather o) throws CloneNotSupportedException {
    o.date = (o.date != null) ? (java.sql.Date) o.date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("stationId", this.stationId);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("tmin", this.tmin);
    __sqoop$field_map.put("tmax", this.tmax);
    __sqoop$field_map.put("snow", this.snow);
    __sqoop$field_map.put("snwd", this.snwd);
    __sqoop$field_map.put("prcp", this.prcp);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("stationId", this.stationId);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("tmin", this.tmin);
    __sqoop$field_map.put("tmax", this.tmax);
    __sqoop$field_map.put("snow", this.snow);
    __sqoop$field_map.put("snwd", this.snwd);
    __sqoop$field_map.put("prcp", this.prcp);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
