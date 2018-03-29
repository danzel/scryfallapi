# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class List(Model):
    """List.

    :param total_cards:
    :type total_cards: int
    :param has_more:
    :type has_more: bool
    :param next_page:
    :type next_page: str
    :param data:
    :type data: list[~swagger.models.Card]
    """

    _attribute_map = {
        'total_cards': {'key': 'total_cards', 'type': 'int'},
        'has_more': {'key': 'has_more', 'type': 'bool'},
        'next_page': {'key': 'next_page', 'type': 'str'},
        'data': {'key': 'data', 'type': '[Card]'},
    }

    def __init__(self, total_cards=None, has_more=None, next_page=None, data=None):
        super(List, self).__init__()
        self.total_cards = total_cards
        self.has_more = has_more
        self.next_page = next_page
        self.data = data
