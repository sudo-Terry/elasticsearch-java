/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Builders for {@link Processor} variants.
 */
public class ProcessorBuilders {
	private ProcessorBuilders() {
	}

	/**
	 * Creates a builder for the {@link AppendProcessor append} {@code Processor}
	 * variant.
	 */
	public static AppendProcessor.Builder append() {
		return new AppendProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link AppendProcessor append} {@code Processor}
	 * variant.
	 */
	public static Processor append(Function<AppendProcessor.Builder, ObjectBuilder<AppendProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.append(fn.apply(new AppendProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link AttachmentProcessor attachment}
	 * {@code Processor} variant.
	 */
	public static AttachmentProcessor.Builder attachment() {
		return new AttachmentProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link AttachmentProcessor attachment}
	 * {@code Processor} variant.
	 */
	public static Processor attachment(Function<AttachmentProcessor.Builder, ObjectBuilder<AttachmentProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.attachment(fn.apply(new AttachmentProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BytesProcessor bytes} {@code Processor}
	 * variant.
	 */
	public static BytesProcessor.Builder bytes() {
		return new BytesProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link BytesProcessor bytes} {@code Processor}
	 * variant.
	 */
	public static Processor bytes(Function<BytesProcessor.Builder, ObjectBuilder<BytesProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.bytes(fn.apply(new BytesProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CircleProcessor circle} {@code Processor}
	 * variant.
	 */
	public static CircleProcessor.Builder circle() {
		return new CircleProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link CircleProcessor circle} {@code Processor}
	 * variant.
	 */
	public static Processor circle(Function<CircleProcessor.Builder, ObjectBuilder<CircleProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.circle(fn.apply(new CircleProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CommunityIDProcessor community_id}
	 * {@code Processor} variant.
	 */
	public static CommunityIDProcessor.Builder communityId() {
		return new CommunityIDProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link CommunityIDProcessor community_id}
	 * {@code Processor} variant.
	 */
	public static Processor communityId(
			Function<CommunityIDProcessor.Builder, ObjectBuilder<CommunityIDProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.communityId(fn.apply(new CommunityIDProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ConvertProcessor convert} {@code Processor}
	 * variant.
	 */
	public static ConvertProcessor.Builder convert() {
		return new ConvertProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link ConvertProcessor convert} {@code Processor}
	 * variant.
	 */
	public static Processor convert(Function<ConvertProcessor.Builder, ObjectBuilder<ConvertProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.convert(fn.apply(new ConvertProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CsvProcessor csv} {@code Processor} variant.
	 */
	public static CsvProcessor.Builder csv() {
		return new CsvProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link CsvProcessor csv} {@code Processor}
	 * variant.
	 */
	public static Processor csv(Function<CsvProcessor.Builder, ObjectBuilder<CsvProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.csv(fn.apply(new CsvProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateProcessor date} {@code Processor}
	 * variant.
	 */
	public static DateProcessor.Builder date() {
		return new DateProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link DateProcessor date} {@code Processor}
	 * variant.
	 */
	public static Processor date(Function<DateProcessor.Builder, ObjectBuilder<DateProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.date(fn.apply(new DateProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateIndexNameProcessor date_index_name}
	 * {@code Processor} variant.
	 */
	public static DateIndexNameProcessor.Builder dateIndexName() {
		return new DateIndexNameProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link DateIndexNameProcessor date_index_name}
	 * {@code Processor} variant.
	 */
	public static Processor dateIndexName(
			Function<DateIndexNameProcessor.Builder, ObjectBuilder<DateIndexNameProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.dateIndexName(fn.apply(new DateIndexNameProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DissectProcessor dissect} {@code Processor}
	 * variant.
	 */
	public static DissectProcessor.Builder dissect() {
		return new DissectProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link DissectProcessor dissect} {@code Processor}
	 * variant.
	 */
	public static Processor dissect(Function<DissectProcessor.Builder, ObjectBuilder<DissectProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.dissect(fn.apply(new DissectProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DotExpanderProcessor dot_expander}
	 * {@code Processor} variant.
	 */
	public static DotExpanderProcessor.Builder dotExpander() {
		return new DotExpanderProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link DotExpanderProcessor dot_expander}
	 * {@code Processor} variant.
	 */
	public static Processor dotExpander(
			Function<DotExpanderProcessor.Builder, ObjectBuilder<DotExpanderProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.dotExpander(fn.apply(new DotExpanderProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DropProcessor drop} {@code Processor}
	 * variant.
	 */
	public static DropProcessor.Builder drop() {
		return new DropProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link DropProcessor drop} {@code Processor}
	 * variant.
	 */
	public static Processor drop(Function<DropProcessor.Builder, ObjectBuilder<DropProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.drop(fn.apply(new DropProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link EnrichProcessor enrich} {@code Processor}
	 * variant.
	 */
	public static EnrichProcessor.Builder enrich() {
		return new EnrichProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link EnrichProcessor enrich} {@code Processor}
	 * variant.
	 */
	public static Processor enrich(Function<EnrichProcessor.Builder, ObjectBuilder<EnrichProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.enrich(fn.apply(new EnrichProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FailProcessor fail} {@code Processor}
	 * variant.
	 */
	public static FailProcessor.Builder fail() {
		return new FailProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link FailProcessor fail} {@code Processor}
	 * variant.
	 */
	public static Processor fail(Function<FailProcessor.Builder, ObjectBuilder<FailProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.fail(fn.apply(new FailProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FingerprintProcessor fingerprint}
	 * {@code Processor} variant.
	 */
	public static FingerprintProcessor.Builder fingerprint() {
		return new FingerprintProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link FingerprintProcessor fingerprint}
	 * {@code Processor} variant.
	 */
	public static Processor fingerprint(
			Function<FingerprintProcessor.Builder, ObjectBuilder<FingerprintProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.fingerprint(fn.apply(new FingerprintProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ForeachProcessor foreach} {@code Processor}
	 * variant.
	 */
	public static ForeachProcessor.Builder foreach() {
		return new ForeachProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link ForeachProcessor foreach} {@code Processor}
	 * variant.
	 */
	public static Processor foreach(Function<ForeachProcessor.Builder, ObjectBuilder<ForeachProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.foreach(fn.apply(new ForeachProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IpLocationProcessor ip_location}
	 * {@code Processor} variant.
	 */
	public static IpLocationProcessor.Builder ipLocation() {
		return new IpLocationProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link IpLocationProcessor ip_location}
	 * {@code Processor} variant.
	 */
	public static Processor ipLocation(Function<IpLocationProcessor.Builder, ObjectBuilder<IpLocationProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.ipLocation(fn.apply(new IpLocationProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoGridProcessor geo_grid} {@code Processor}
	 * variant.
	 */
	public static GeoGridProcessor.Builder geoGrid() {
		return new GeoGridProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link GeoGridProcessor geo_grid}
	 * {@code Processor} variant.
	 */
	public static Processor geoGrid(Function<GeoGridProcessor.Builder, ObjectBuilder<GeoGridProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.geoGrid(fn.apply(new GeoGridProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoIpProcessor geoip} {@code Processor}
	 * variant.
	 */
	public static GeoIpProcessor.Builder geoip() {
		return new GeoIpProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link GeoIpProcessor geoip} {@code Processor}
	 * variant.
	 */
	public static Processor geoip(Function<GeoIpProcessor.Builder, ObjectBuilder<GeoIpProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.geoip(fn.apply(new GeoIpProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GrokProcessor grok} {@code Processor}
	 * variant.
	 */
	public static GrokProcessor.Builder grok() {
		return new GrokProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link GrokProcessor grok} {@code Processor}
	 * variant.
	 */
	public static Processor grok(Function<GrokProcessor.Builder, ObjectBuilder<GrokProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.grok(fn.apply(new GrokProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GsubProcessor gsub} {@code Processor}
	 * variant.
	 */
	public static GsubProcessor.Builder gsub() {
		return new GsubProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link GsubProcessor gsub} {@code Processor}
	 * variant.
	 */
	public static Processor gsub(Function<GsubProcessor.Builder, ObjectBuilder<GsubProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.gsub(fn.apply(new GsubProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HtmlStripProcessor html_strip}
	 * {@code Processor} variant.
	 */
	public static HtmlStripProcessor.Builder htmlStrip() {
		return new HtmlStripProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link HtmlStripProcessor html_strip}
	 * {@code Processor} variant.
	 */
	public static Processor htmlStrip(Function<HtmlStripProcessor.Builder, ObjectBuilder<HtmlStripProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.htmlStrip(fn.apply(new HtmlStripProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link InferenceProcessor inference}
	 * {@code Processor} variant.
	 */
	public static InferenceProcessor.Builder inference() {
		return new InferenceProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link InferenceProcessor inference}
	 * {@code Processor} variant.
	 */
	public static Processor inference(Function<InferenceProcessor.Builder, ObjectBuilder<InferenceProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.inference(fn.apply(new InferenceProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link JoinProcessor join} {@code Processor}
	 * variant.
	 */
	public static JoinProcessor.Builder join() {
		return new JoinProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link JoinProcessor join} {@code Processor}
	 * variant.
	 */
	public static Processor join(Function<JoinProcessor.Builder, ObjectBuilder<JoinProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.join(fn.apply(new JoinProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link JsonProcessor json} {@code Processor}
	 * variant.
	 */
	public static JsonProcessor.Builder json() {
		return new JsonProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link JsonProcessor json} {@code Processor}
	 * variant.
	 */
	public static Processor json(Function<JsonProcessor.Builder, ObjectBuilder<JsonProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.json(fn.apply(new JsonProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KeyValueProcessor kv} {@code Processor}
	 * variant.
	 */
	public static KeyValueProcessor.Builder kv() {
		return new KeyValueProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link KeyValueProcessor kv} {@code Processor}
	 * variant.
	 */
	public static Processor kv(Function<KeyValueProcessor.Builder, ObjectBuilder<KeyValueProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.kv(fn.apply(new KeyValueProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LowercaseProcessor lowercase}
	 * {@code Processor} variant.
	 */
	public static LowercaseProcessor.Builder lowercase() {
		return new LowercaseProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link LowercaseProcessor lowercase}
	 * {@code Processor} variant.
	 */
	public static Processor lowercase(Function<LowercaseProcessor.Builder, ObjectBuilder<LowercaseProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.lowercase(fn.apply(new LowercaseProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NetworkDirectionProcessor network_direction}
	 * {@code Processor} variant.
	 */
	public static NetworkDirectionProcessor.Builder networkDirection() {
		return new NetworkDirectionProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link NetworkDirectionProcessor
	 * network_direction} {@code Processor} variant.
	 */
	public static Processor networkDirection(
			Function<NetworkDirectionProcessor.Builder, ObjectBuilder<NetworkDirectionProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.networkDirection(fn.apply(new NetworkDirectionProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PipelineProcessor pipeline}
	 * {@code Processor} variant.
	 */
	public static PipelineProcessor.Builder pipeline() {
		return new PipelineProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link PipelineProcessor pipeline}
	 * {@code Processor} variant.
	 */
	public static Processor pipeline(Function<PipelineProcessor.Builder, ObjectBuilder<PipelineProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.pipeline(fn.apply(new PipelineProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RedactProcessor redact} {@code Processor}
	 * variant.
	 */
	public static RedactProcessor.Builder redact() {
		return new RedactProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link RedactProcessor redact} {@code Processor}
	 * variant.
	 */
	public static Processor redact(Function<RedactProcessor.Builder, ObjectBuilder<RedactProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.redact(fn.apply(new RedactProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RegisteredDomainProcessor registered_domain}
	 * {@code Processor} variant.
	 */
	public static RegisteredDomainProcessor.Builder registeredDomain() {
		return new RegisteredDomainProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link RegisteredDomainProcessor
	 * registered_domain} {@code Processor} variant.
	 */
	public static Processor registeredDomain(
			Function<RegisteredDomainProcessor.Builder, ObjectBuilder<RegisteredDomainProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.registeredDomain(fn.apply(new RegisteredDomainProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RemoveProcessor remove} {@code Processor}
	 * variant.
	 */
	public static RemoveProcessor.Builder remove() {
		return new RemoveProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link RemoveProcessor remove} {@code Processor}
	 * variant.
	 */
	public static Processor remove(Function<RemoveProcessor.Builder, ObjectBuilder<RemoveProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.remove(fn.apply(new RemoveProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RenameProcessor rename} {@code Processor}
	 * variant.
	 */
	public static RenameProcessor.Builder rename() {
		return new RenameProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link RenameProcessor rename} {@code Processor}
	 * variant.
	 */
	public static Processor rename(Function<RenameProcessor.Builder, ObjectBuilder<RenameProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.rename(fn.apply(new RenameProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RerouteProcessor reroute} {@code Processor}
	 * variant.
	 */
	public static RerouteProcessor.Builder reroute() {
		return new RerouteProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link RerouteProcessor reroute} {@code Processor}
	 * variant.
	 */
	public static Processor reroute(Function<RerouteProcessor.Builder, ObjectBuilder<RerouteProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.reroute(fn.apply(new RerouteProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScriptProcessor script} {@code Processor}
	 * variant.
	 */
	public static ScriptProcessor.Builder script() {
		return new ScriptProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link ScriptProcessor script} {@code Processor}
	 * variant.
	 */
	public static Processor script(Function<ScriptProcessor.Builder, ObjectBuilder<ScriptProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.script(fn.apply(new ScriptProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SetProcessor set} {@code Processor} variant.
	 */
	public static SetProcessor.Builder set() {
		return new SetProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link SetProcessor set} {@code Processor}
	 * variant.
	 */
	public static Processor set(Function<SetProcessor.Builder, ObjectBuilder<SetProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.set(fn.apply(new SetProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SetSecurityUserProcessor set_security_user}
	 * {@code Processor} variant.
	 */
	public static SetSecurityUserProcessor.Builder setSecurityUser() {
		return new SetSecurityUserProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link SetSecurityUserProcessor set_security_user}
	 * {@code Processor} variant.
	 */
	public static Processor setSecurityUser(
			Function<SetSecurityUserProcessor.Builder, ObjectBuilder<SetSecurityUserProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.setSecurityUser(fn.apply(new SetSecurityUserProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SortProcessor sort} {@code Processor}
	 * variant.
	 */
	public static SortProcessor.Builder sort() {
		return new SortProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link SortProcessor sort} {@code Processor}
	 * variant.
	 */
	public static Processor sort(Function<SortProcessor.Builder, ObjectBuilder<SortProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.sort(fn.apply(new SortProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SplitProcessor split} {@code Processor}
	 * variant.
	 */
	public static SplitProcessor.Builder split() {
		return new SplitProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link SplitProcessor split} {@code Processor}
	 * variant.
	 */
	public static Processor split(Function<SplitProcessor.Builder, ObjectBuilder<SplitProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.split(fn.apply(new SplitProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TerminateProcessor terminate}
	 * {@code Processor} variant.
	 */
	public static TerminateProcessor.Builder terminate() {
		return new TerminateProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link TerminateProcessor terminate}
	 * {@code Processor} variant.
	 */
	public static Processor terminate(Function<TerminateProcessor.Builder, ObjectBuilder<TerminateProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.terminate(fn.apply(new TerminateProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TrimProcessor trim} {@code Processor}
	 * variant.
	 */
	public static TrimProcessor.Builder trim() {
		return new TrimProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link TrimProcessor trim} {@code Processor}
	 * variant.
	 */
	public static Processor trim(Function<TrimProcessor.Builder, ObjectBuilder<TrimProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.trim(fn.apply(new TrimProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UppercaseProcessor uppercase}
	 * {@code Processor} variant.
	 */
	public static UppercaseProcessor.Builder uppercase() {
		return new UppercaseProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link UppercaseProcessor uppercase}
	 * {@code Processor} variant.
	 */
	public static Processor uppercase(Function<UppercaseProcessor.Builder, ObjectBuilder<UppercaseProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.uppercase(fn.apply(new UppercaseProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UrlDecodeProcessor urldecode}
	 * {@code Processor} variant.
	 */
	public static UrlDecodeProcessor.Builder urldecode() {
		return new UrlDecodeProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link UrlDecodeProcessor urldecode}
	 * {@code Processor} variant.
	 */
	public static Processor urldecode(Function<UrlDecodeProcessor.Builder, ObjectBuilder<UrlDecodeProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.urldecode(fn.apply(new UrlDecodeProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UriPartsProcessor uri_parts}
	 * {@code Processor} variant.
	 */
	public static UriPartsProcessor.Builder uriParts() {
		return new UriPartsProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link UriPartsProcessor uri_parts}
	 * {@code Processor} variant.
	 */
	public static Processor uriParts(Function<UriPartsProcessor.Builder, ObjectBuilder<UriPartsProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.uriParts(fn.apply(new UriPartsProcessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UserAgentProcessor user_agent}
	 * {@code Processor} variant.
	 */
	public static UserAgentProcessor.Builder userAgent() {
		return new UserAgentProcessor.Builder();
	}

	/**
	 * Creates a Processor of the {@link UserAgentProcessor user_agent}
	 * {@code Processor} variant.
	 */
	public static Processor userAgent(Function<UserAgentProcessor.Builder, ObjectBuilder<UserAgentProcessor>> fn) {
		Processor.Builder builder = new Processor.Builder();
		builder.userAgent(fn.apply(new UserAgentProcessor.Builder()).build());
		return builder.build();
	}

}
