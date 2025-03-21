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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: security.create_service_token.Request

/**
 * Create a service account token.
 * <p>
 * Create a service accounts token for access without requiring basic
 * authentication.
 * <p>
 * NOTE: Service account tokens never expire. You must actively delete them if
 * they are no longer needed.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.create_service_token.Request">API
 *      specification</a>
 */

public class CreateServiceTokenRequest extends RequestBase {
	@Nullable
	private final String name;

	private final String namespace;

	@Nullable
	private final Refresh refresh;

	private final String service;

	// ---------------------------------------------------------------------------------------------

	private CreateServiceTokenRequest(Builder builder) {

		this.name = builder.name;
		this.namespace = ApiTypeHelper.requireNonNull(builder.namespace, this, "namespace");
		this.refresh = builder.refresh;
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");

	}

	public static CreateServiceTokenRequest of(Function<Builder, ObjectBuilder<CreateServiceTokenRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The name for the service account token. If omitted, a random name will be
	 * generated.
	 * <p>
	 * Token names must be at least one and no more than 256 characters. They can
	 * contain alphanumeric characters (a-z, A-Z, 0-9), dashes (<code>-</code>), and
	 * underscores (<code>_</code>), but cannot begin with an underscore.
	 * <p>
	 * NOTE: Token names must be unique in the context of the associated service
	 * account. They must also be globally unique with their fully qualified names,
	 * which are comprised of the service account principal and token name, such as
	 * <code>&lt;namespace&gt;/&lt;service&gt;/&lt;token-name&gt;</code>.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The name of the namespace, which is a top-level grouping of
	 * service accounts.
	 * <p>
	 * API name: {@code namespace}
	 */
	public final String namespace() {
		return this.namespace;
	}

	/**
	 * If <code>true</code> then refresh the affected shards to make this operation
	 * visible to search, if <code>wait_for</code> (the default) then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * Required - The name of the service.
	 * <p>
	 * API name: {@code service}
	 */
	public final String service() {
		return this.service;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateServiceTokenRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CreateServiceTokenRequest> {
		@Nullable
		private String name;

		private String namespace;

		@Nullable
		private Refresh refresh;

		private String service;

		/**
		 * The name for the service account token. If omitted, a random name will be
		 * generated.
		 * <p>
		 * Token names must be at least one and no more than 256 characters. They can
		 * contain alphanumeric characters (a-z, A-Z, 0-9), dashes (<code>-</code>), and
		 * underscores (<code>_</code>), but cannot begin with an underscore.
		 * <p>
		 * NOTE: Token names must be unique in the context of the associated service
		 * account. They must also be globally unique with their fully qualified names,
		 * which are comprised of the service account principal and token name, such as
		 * <code>&lt;namespace&gt;/&lt;service&gt;/&lt;token-name&gt;</code>.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The name of the namespace, which is a top-level grouping of
		 * service accounts.
		 * <p>
		 * API name: {@code namespace}
		 */
		public final Builder namespace(String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * If <code>true</code> then refresh the affected shards to make this operation
		 * visible to search, if <code>wait_for</code> (the default) then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Required - The name of the service.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(String value) {
			this.service = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CreateServiceTokenRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateServiceTokenRequest build() {
			_checkSingleUse();

			return new CreateServiceTokenRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.create_service_token}".
	 */
	public static final Endpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.create_service_token",

			// Request method
			request -> {
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;
				final int _name = 1 << 2;

				int propsSet = 0;

				propsSet |= _service;
				propsSet |= _namespace;
				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_namespace | _service | _name))
					return "PUT";
				if (propsSet == (_namespace | _service))
					return "POST";
				throw SimpleEndpoint.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;
				final int _name = 1 << 2;

				int propsSet = 0;

				propsSet |= _service;
				propsSet |= _namespace;
				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_namespace | _service | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.namespace, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.service, buf);
					buf.append("/credential");
					buf.append("/token");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				if (propsSet == (_namespace | _service)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.namespace, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.service, buf);
					buf.append("/credential");
					buf.append("/token");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;
				final int _name = 1 << 2;

				int propsSet = 0;

				propsSet |= _service;
				propsSet |= _namespace;
				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_namespace | _service | _name)) {
					params.put("namespace", request.namespace);
					params.put("service", request.service);
					params.put("name", request.name);
				}
				if (propsSet == (_namespace | _service)) {
					params.put("namespace", request.namespace);
					params.put("service", request.service);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, CreateServiceTokenResponse._DESERIALIZER);
}
