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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

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

// typedef: cat.aliases.Request

/**
 * Get aliases.
 * <p>
 * Get the cluster's index aliases, including filter and routing information.
 * This API does not return data stream aliases.
 * <p>
 * IMPORTANT: CAT APIs are only intended for human consumption using the command
 * line or the Kibana console. They are not intended for use by applications.
 * For application consumption, use the aliases API.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.aliases.Request">API
 *      specification</a>
 */

public class AliasesRequest extends CatRequestBase {
	private final List<ExpandWildcard> expandWildcards;

	private final List<String> h;

	@Nullable
	private final Time masterTimeout;

	private final List<String> name;

	private final List<String> s;

	// ---------------------------------------------------------------------------------------------

	private AliasesRequest(Builder builder) {

		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.h = ApiTypeHelper.unmodifiable(builder.h);
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.unmodifiable(builder.name);
		this.s = ApiTypeHelper.unmodifiable(builder.s);

	}

	public static AliasesRequest of(Function<Builder, ObjectBuilder<AliasesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. It supports comma-separated values, such as
	 * <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * List of columns to appear in the response. Supports simple wildcards.
	 * <p>
	 * API name: {@code h}
	 */
	public final List<String> h() {
		return this.h;
	}

	/**
	 * The period to wait for a connection to the master node. If the master node is
	 * not available before the timeout expires, the request fails and returns an
	 * error. To indicated that the request should never timeout, you can set it to
	 * <code>-1</code>.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * A comma-separated list of aliases to retrieve. Supports wildcards
	 * (<code>*</code>). To retrieve all aliases, omit this parameter or use
	 * <code>*</code> or <code>_all</code>.
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * List of columns that determine how the table should be sorted. Sorting
	 * defaults to ascending and can be changed by setting <code>:asc</code> or
	 * <code>:desc</code> as a suffix to the column name.
	 * <p>
	 * API name: {@code s}
	 */
	public final List<String> s() {
		return this.s;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AliasesRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AliasesRequest> {
		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private List<String> h;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<String> name;

		@Nullable
		private List<String> s;

		/**
		 * The type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. It supports comma-separated values, such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * The type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. It supports comma-separated values, such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * List of columns to appear in the response. Supports simple wildcards.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>h</code>.
		 */
		public final Builder h(List<String> list) {
			this.h = _listAddAll(this.h, list);
			return this;
		}

		/**
		 * List of columns to appear in the response. Supports simple wildcards.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds one or more values to <code>h</code>.
		 */
		public final Builder h(String value, String... values) {
			this.h = _listAdd(this.h, value, values);
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If the master node is
		 * not available before the timeout expires, the request fails and returns an
		 * error. To indicated that the request should never timeout, you can set it to
		 * <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If the master node is
		 * not available before the timeout expires, the request fails and returns an
		 * error. To indicated that the request should never timeout, you can set it to
		 * <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * A comma-separated list of aliases to retrieve. Supports wildcards
		 * (<code>*</code>). To retrieve all aliases, omit this parameter or use
		 * <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * A comma-separated list of aliases to retrieve. Supports wildcards
		 * (<code>*</code>). To retrieve all aliases, omit this parameter or use
		 * <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		/**
		 * List of columns that determine how the table should be sorted. Sorting
		 * defaults to ascending and can be changed by setting <code>:asc</code> or
		 * <code>:desc</code> as a suffix to the column name.
		 * <p>
		 * API name: {@code s}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>s</code>.
		 */
		public final Builder s(List<String> list) {
			this.s = _listAddAll(this.s, list);
			return this;
		}

		/**
		 * List of columns that determine how the table should be sorted. Sorting
		 * defaults to ascending and can be changed by setting <code>:asc</code> or
		 * <code>:desc</code> as a suffix to the column name.
		 * <p>
		 * API name: {@code s}
		 * <p>
		 * Adds one or more values to <code>s</code>.
		 */
		public final Builder s(String value, String... values) {
			this.s = _listAdd(this.s, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AliasesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AliasesRequest build() {
			_checkSingleUse();

			return new AliasesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.aliases}".
	 */
	public static final Endpoint<AliasesRequest, AliasesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.aliases",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/aliases");
					return buf.toString();
				}
				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/aliases");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == 0) {
				}
				if (propsSet == (_name)) {
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (ApiTypeHelper.isDefined(request.s)) {
					params.put("s", request.s.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (ApiTypeHelper.isDefined(request.h)) {
					params.put("h", request.h.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, AliasesResponse._DESERIALIZER);
}
