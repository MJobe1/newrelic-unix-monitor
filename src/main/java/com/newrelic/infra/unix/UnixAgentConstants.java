package com.newrelic.infra.unix;
import java.nio.charset.Charset;
public final class UnixAgentConstants {
	
	// Defaults
	public static final int    kDefaultLineLimit = 0;
	public static final String kDefaultMetricName="default";
	public static final int    kDefaultMetricRatio = 1;
	public static final String kDefaultMetricType="NORMAL";
	public static final String kDefaultPagesizeCommand="pagesize";
		
	// Special keywords for commands & related fields
	public static final String kMemberPlaceholder = "MEMBER_PLACEHOLDER";
	
	// Special keywords for metric mappings ("columns" in regex matches)
	public static final String kColumnMetricDiskName = "DISK_NAME";
	public static final String kColumnIgnore = "IGNORE_COLUMN";
	public static final String kColumnMetricName = "METRIC_NAME";
	// METRIC_INSTANCE and METRIC_PREFIX are interchangeable
	public static final String kColumnMetricInstance = "METRIC_INSTANCE";
	public static final String kColumnMetricPrefix = "METRIC_PREFIX";
	public static final String kColumnMetricValue = "METRIC_VALUE";
	public static final String kColumnMetricProcessName = "PROCESS_NAME";
	public static final String kColumnMetricProcessNameAndSpaces = "PROCESS_NAME_MAY_HAVE_SPACES";
	public static final String kColumnPageSize = "PAGE_SIZE";
	
	// Event & metric settings
	public static final String kEventTypePrefix = "unixMonitor";
	public static final char   kMetricTreeDivider='.';
	public static final String kCommandMetricName = "command";
	public static final int    kInsightsAttributeSize = 4092;
	public static final String kInstanceMetricName = "instance";	
	public static final String kJavaClassMetricName = "javaclass";
	public static final String KAOSMetricName = "osName";

	public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
	public static final Charset UTF_8 = Charset.forName("UTF-8");
}
