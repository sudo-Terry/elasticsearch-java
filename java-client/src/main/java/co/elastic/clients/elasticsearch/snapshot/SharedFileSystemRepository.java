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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: snapshot._types.SharedFileSystemRepository

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.SharedFileSystemRepository">API
 *      specification</a>
 */
@JsonpDeserializable
public class SharedFileSystemRepository extends RepositoryBase implements RepositoryVariant {
	private final SharedFileSystemRepositorySettings settings;

	// ---------------------------------------------------------------------------------------------

	private SharedFileSystemRepository(Builder builder) {
		super(builder);

		this.settings = ApiTypeHelper.requireNonNull(builder.settings, this, "settings");

	}

	public static SharedFileSystemRepository of(Function<Builder, ObjectBuilder<SharedFileSystemRepository>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Repository variant kind.
	 */
	@Override
	public Repository.Kind _repositoryKind() {
		return Repository.Kind.Fs;
	}

	/**
	 * Required - The repository settings.
	 * <p>
	 * API name: {@code settings}
	 */
	public final SharedFileSystemRepositorySettings settings() {
		return this.settings;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "fs");
		super.serializeInternal(generator, mapper);
		generator.writeKey("settings");
		this.settings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SharedFileSystemRepository}.
	 */

	public static class Builder extends RepositoryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SharedFileSystemRepository> {
		private SharedFileSystemRepositorySettings settings;

		/**
		 * Required - The repository settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(SharedFileSystemRepositorySettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - The repository settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(
				Function<SharedFileSystemRepositorySettings.Builder, ObjectBuilder<SharedFileSystemRepositorySettings>> fn) {
			return this.settings(fn.apply(new SharedFileSystemRepositorySettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SharedFileSystemRepository}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SharedFileSystemRepository build() {
			_checkSingleUse();

			return new SharedFileSystemRepository(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SharedFileSystemRepository}
	 */
	public static final JsonpDeserializer<SharedFileSystemRepository> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SharedFileSystemRepository::setupSharedFileSystemRepositoryDeserializer);

	protected static void setupSharedFileSystemRepositoryDeserializer(
			ObjectDeserializer<SharedFileSystemRepository.Builder> op) {
		RepositoryBase.setupRepositoryBaseDeserializer(op);
		op.add(Builder::settings, SharedFileSystemRepositorySettings._DESERIALIZER, "settings");

		op.ignore("type");
	}

}
