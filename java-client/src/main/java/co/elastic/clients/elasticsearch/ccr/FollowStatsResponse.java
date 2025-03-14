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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
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

// typedef: ccr.follow_stats.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ccr.follow_stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class FollowStatsResponse implements JsonpSerializable {
	private final List<FollowIndexStats> indices;

	// ---------------------------------------------------------------------------------------------

	private FollowStatsResponse(Builder builder) {

		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static FollowStatsResponse of(Function<Builder, ObjectBuilder<FollowStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - An array of follower index statistics.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<FollowIndexStats> indices() {
		return this.indices;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (FollowIndexStats item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FollowStatsResponse> {
		private List<FollowIndexStats> indices;

		/**
		 * Required - An array of follower index statistics.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<FollowIndexStats> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - An array of follower index statistics.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(FollowIndexStats value, FollowIndexStats... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - An array of follower index statistics.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(Function<FollowIndexStats.Builder, ObjectBuilder<FollowIndexStats>> fn) {
			return indices(fn.apply(new FollowIndexStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FollowStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowStatsResponse build() {
			_checkSingleUse();

			return new FollowStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowStatsResponse}
	 */
	public static final JsonpDeserializer<FollowStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FollowStatsResponse::setupFollowStatsResponseDeserializer);

	protected static void setupFollowStatsResponseDeserializer(ObjectDeserializer<FollowStatsResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(FollowIndexStats._DESERIALIZER), "indices");

	}

}
