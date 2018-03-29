/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

import { ServiceClient, ServiceClientOptions } from 'ms-rest';
import * as models from "./models";
import * as operations from "./operations";

export default class ScryfallClient extends ServiceClient {
  /**
   * @class
   * Initializes a new instance of the ScryfallClient class.
   * @constructor
   *
   * @param {string} [baseUri] - The base URI of the service.
   *
   * @param {object} [options] - The parameter options
   *
   * @param {Array} [options.filters] - Filters to be added to the request pipeline
   *
   * @param {object} [options.requestOptions] - Options for the underlying request object
   * {@link https://github.com/request/request#requestoptions-callback Options doc}
   *
   * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
   *
   */
  constructor(baseUri?: string, options?: ServiceClientOptions);

  // Operation groups
  sets: operations.Sets;
  cards: operations.Cards;
}

export { ScryfallClient, models as ScryfallModels };
