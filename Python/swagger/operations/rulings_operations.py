# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.pipeline import ClientRawResponse

from .. import models


class RulingsOperations(object):
    """RulingsOperations operations.

    :param client: Client for service requests.
    :param config: Configuration of service client.
    :param serializer: An object model serializer.
    :param deserializer: An object model deserializer.
    """

    models = models

    def __init__(self, client, config, serializer, deserializer):

        self._client = client
        self._serialize = serializer
        self._deserialize = deserializer

        self.config = config

    def get_by_multiverse_id(
            self, id, custom_headers=None, raw=False, **operation_config):
        """

        :param id:
        :type id: int
        :param dict custom_headers: headers that will be added to the request
        :param bool raw: returns the direct response alongside the
         deserialized response
        :param operation_config: :ref:`Operation configuration
         overrides<msrest:optionsforoperations>`.
        :return: RulingList or ClientRawResponse if raw=true
        :rtype: ~swagger.models.RulingList or
         ~msrest.pipeline.ClientRawResponse
        :raises: :class:`ErrorException<swagger.models.ErrorException>`
        """
        # Construct URL
        url = self.get_by_multiverse_id.metadata['url']
        path_format_arguments = {
            'id': self._serialize.url("id", id, 'int')
        }
        url = self._client.format_url(url, **path_format_arguments)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, stream=False, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('RulingList', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
    get_by_multiverse_id.metadata = {'url': '/cards/multiverse/{id}/rulings'}

    def get_by_mtgo_id(
            self, id, custom_headers=None, raw=False, **operation_config):
        """

        :param id:
        :type id: int
        :param dict custom_headers: headers that will be added to the request
        :param bool raw: returns the direct response alongside the
         deserialized response
        :param operation_config: :ref:`Operation configuration
         overrides<msrest:optionsforoperations>`.
        :return: RulingList or ClientRawResponse if raw=true
        :rtype: ~swagger.models.RulingList or
         ~msrest.pipeline.ClientRawResponse
        :raises: :class:`ErrorException<swagger.models.ErrorException>`
        """
        # Construct URL
        url = self.get_by_mtgo_id.metadata['url']
        path_format_arguments = {
            'id': self._serialize.url("id", id, 'int')
        }
        url = self._client.format_url(url, **path_format_arguments)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, stream=False, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('RulingList', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
    get_by_mtgo_id.metadata = {'url': '/cards/mtgo/{id}/rulings'}

    def get_by_code_by_number_id(
            self, code, number, custom_headers=None, raw=False, **operation_config):
        """

        :param code:
        :type code: str
        :param number:
        :type number: int
        :param dict custom_headers: headers that will be added to the request
        :param bool raw: returns the direct response alongside the
         deserialized response
        :param operation_config: :ref:`Operation configuration
         overrides<msrest:optionsforoperations>`.
        :return: RulingList or ClientRawResponse if raw=true
        :rtype: ~swagger.models.RulingList or
         ~msrest.pipeline.ClientRawResponse
        :raises: :class:`ErrorException<swagger.models.ErrorException>`
        """
        # Construct URL
        url = self.get_by_code_by_number_id.metadata['url']
        path_format_arguments = {
            'code': self._serialize.url("code", code, 'str'),
            'number': self._serialize.url("number", number, 'int')
        }
        url = self._client.format_url(url, **path_format_arguments)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, stream=False, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('RulingList', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
    get_by_code_by_number_id.metadata = {'url': '/cards/{code}/{number}/rulings'}

    def get_by_id(
            self, id, custom_headers=None, raw=False, **operation_config):
        """

        :param id:
        :type id: str
        :param dict custom_headers: headers that will be added to the request
        :param bool raw: returns the direct response alongside the
         deserialized response
        :param operation_config: :ref:`Operation configuration
         overrides<msrest:optionsforoperations>`.
        :return: RulingList or ClientRawResponse if raw=true
        :rtype: ~swagger.models.RulingList or
         ~msrest.pipeline.ClientRawResponse
        :raises: :class:`ErrorException<swagger.models.ErrorException>`
        """
        # Construct URL
        url = self.get_by_id.metadata['url']
        path_format_arguments = {
            'id': self._serialize.url("id", id, 'str')
        }
        url = self._client.format_url(url, **path_format_arguments)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, stream=False, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('RulingList', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
    get_by_id.metadata = {'url': '/cards/{id}/rulings'}