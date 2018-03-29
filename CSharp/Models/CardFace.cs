// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Scryfall.API.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class CardFace
    {
        /// <summary>
        /// Initializes a new instance of the CardFace class.
        /// </summary>
        public CardFace()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the CardFace class.
        /// </summary>
        public CardFace(string name = default(string), string manaCost = default(string), string typeLine = default(string), string oracleText = default(string))
        {
            Name = name;
            ManaCost = manaCost;
            TypeLine = typeLine;
            OracleText = oracleText;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "mana_cost")]
        public string ManaCost { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "type_line")]
        public string TypeLine { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "oracle_text")]
        public string OracleText { get; set; }

    }
}
