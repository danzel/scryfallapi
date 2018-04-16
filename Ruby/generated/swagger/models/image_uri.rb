# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module scryfall
  module Models
    #
    # Model object.
    #
    #
    class ImageUri
      # @return [String]
      attr_accessor :small

      # @return [String]
      attr_accessor :normal

      # @return [String]
      attr_accessor :large

      # @return [String]
      attr_accessor :png

      # @return [String]
      attr_accessor :art_crop

      # @return [String]
      attr_accessor :border_crop


      #
      # Mapper for ImageUri class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'image_uri',
          type: {
            name: 'Composite',
            class_name: 'ImageUri',
            model_properties: {
              small: {
                client_side_validation: true,
                required: false,
                serialized_name: 'small',
                type: {
                  name: 'String'
                }
              },
              normal: {
                client_side_validation: true,
                required: false,
                serialized_name: 'normal',
                type: {
                  name: 'String'
                }
              },
              large: {
                client_side_validation: true,
                required: false,
                serialized_name: 'large',
                type: {
                  name: 'String'
                }
              },
              png: {
                client_side_validation: true,
                required: false,
                serialized_name: 'png',
                type: {
                  name: 'String'
                }
              },
              art_crop: {
                client_side_validation: true,
                required: false,
                serialized_name: 'art_crop',
                type: {
                  name: 'String'
                }
              },
              border_crop: {
                client_side_validation: true,
                required: false,
                serialized_name: 'border_crop',
                type: {
                  name: 'String'
                }
              }
            }
          }
        }
      end
    end
  end
end
