// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Scryfall.API.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class Card
    {
        /// <summary>
        /// Initializes a new instance of the Card class.
        /// </summary>
        public Card()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the Card class.
        /// </summary>
        /// <param name="rarity">Possible values include: 'common', 'uncommon',
        /// 'rare', 'mythic'</param>
        /// <param name="borderColor">Possible values include: 'black',
        /// 'borderless', 'gold', 'silver', 'white'</param>
        public Card(System.Guid? id = default(System.Guid?), System.Guid? oracleId = default(System.Guid?), IList<int?> multiverseIds = default(IList<int?>), int? mtgoId = default(int?), int? mtgoFoilId = default(int?), string uri = default(string), string scryfallUri = default(string), string printsSearchUri = default(string), string name = default(string), string layout = default(string), double? cmc = default(double?), string typeLine = default(string), string oracleText = default(string), string manaCost = default(string), string power = default(string), string toughness = default(string), string loyalty = default(string), string lifeModifier = default(string), string handModifier = default(string), IList<Color?> colors = default(IList<Color?>), IList<Color?> colorIndicator = default(IList<Color?>), IList<Color?> colorIdentity = default(IList<Color?>), object allParts = default(object), IList<CardFace> cardFaces = default(IList<CardFace>), Legality legalities = default(Legality), bool? reserved = default(bool?), int? edhrecRank = default(int?), string set = default(string), string setName = default(string), string collectorNumber = default(string), string setSearchUri = default(string), string scryfallSetUri = default(string), ImageUri imageUris = default(ImageUri), bool? highresImage = default(bool?), bool? reprint = default(bool?), bool? digital = default(bool?), Rarity? rarity = default(Rarity?), string flavorText = default(string), string artist = default(string), System.Guid? illustrationId = default(System.Guid?), string frame = default(string), bool? fullArt = default(bool?), string watermark = default(string), BorderColor? borderColor = default(BorderColor?), int? storySpotlightNumber = default(int?), string storySpotlightUri = default(string), bool? timeshifted = default(bool?), bool? colorshifted = default(bool?), bool? futureshifted = default(bool?))
        {
            Id = id;
            OracleId = oracleId;
            MultiverseIds = multiverseIds;
            MtgoId = mtgoId;
            MtgoFoilId = mtgoFoilId;
            Uri = uri;
            ScryfallUri = scryfallUri;
            PrintsSearchUri = printsSearchUri;
            Name = name;
            Layout = layout;
            Cmc = cmc;
            TypeLine = typeLine;
            OracleText = oracleText;
            ManaCost = manaCost;
            Power = power;
            Toughness = toughness;
            Loyalty = loyalty;
            LifeModifier = lifeModifier;
            HandModifier = handModifier;
            Colors = colors;
            ColorIndicator = colorIndicator;
            ColorIdentity = colorIdentity;
            AllParts = allParts;
            CardFaces = cardFaces;
            Legalities = legalities;
            Reserved = reserved;
            EdhrecRank = edhrecRank;
            Set = set;
            SetName = setName;
            CollectorNumber = collectorNumber;
            SetSearchUri = setSearchUri;
            ScryfallSetUri = scryfallSetUri;
            ImageUris = imageUris;
            HighresImage = highresImage;
            Reprint = reprint;
            Digital = digital;
            Rarity = rarity;
            FlavorText = flavorText;
            Artist = artist;
            IllustrationId = illustrationId;
            Frame = frame;
            FullArt = fullArt;
            Watermark = watermark;
            BorderColor = borderColor;
            StorySpotlightNumber = storySpotlightNumber;
            StorySpotlightUri = storySpotlightUri;
            Timeshifted = timeshifted;
            Colorshifted = colorshifted;
            Futureshifted = futureshifted;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public System.Guid? Id { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "oracle_id")]
        public System.Guid? OracleId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "multiverse_ids")]
        public IList<int?> MultiverseIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "mtgo_id")]
        public int? MtgoId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "mtgo_foil_id")]
        public int? MtgoFoilId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "uri")]
        public string Uri { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "scryfall_uri")]
        public string ScryfallUri { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "prints_search_uri")]
        public string PrintsSearchUri { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "layout")]
        public string Layout { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "cmc")]
        public double? Cmc { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "type_line")]
        public string TypeLine { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "oracle_text")]
        public string OracleText { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "mana_cost")]
        public string ManaCost { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "power")]
        public string Power { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "toughness")]
        public string Toughness { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "loyalty")]
        public string Loyalty { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "life_modifier")]
        public string LifeModifier { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "hand_modifier")]
        public string HandModifier { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "colors")]
        public IList<Color?> Colors { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "color_indicator")]
        public IList<Color?> ColorIndicator { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "color_identity")]
        public IList<Color?> ColorIdentity { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "all_parts")]
        public object AllParts { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "card_faces")]
        public IList<CardFace> CardFaces { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "legalities")]
        public Legality Legalities { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "reserved")]
        public bool? Reserved { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "edhrec_rank")]
        public int? EdhrecRank { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "set")]
        public string Set { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "set_name")]
        public string SetName { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "collector_number")]
        public string CollectorNumber { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "set_search_uri")]
        public string SetSearchUri { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "scryfall_set_uri")]
        public string ScryfallSetUri { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "image_uris")]
        public ImageUri ImageUris { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "highres_image")]
        public bool? HighresImage { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "reprint")]
        public bool? Reprint { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "digital")]
        public bool? Digital { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'common', 'uncommon', 'rare',
        /// 'mythic'
        /// </summary>
        [JsonProperty(PropertyName = "rarity")]
        public Rarity? Rarity { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "flavor_text")]
        public string FlavorText { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "artist")]
        public string Artist { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "illustration_id")]
        public System.Guid? IllustrationId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "frame")]
        public string Frame { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "full_art")]
        public bool? FullArt { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "watermark")]
        public string Watermark { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'black', 'borderless',
        /// 'gold', 'silver', 'white'
        /// </summary>
        [JsonProperty(PropertyName = "border_color")]
        public BorderColor? BorderColor { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "story_spotlight_number")]
        public int? StorySpotlightNumber { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "story_spotlight_uri")]
        public string StorySpotlightUri { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "timeshifted")]
        public bool? Timeshifted { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "colorshifted")]
        public bool? Colorshifted { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "futureshifted")]
        public bool? Futureshifted { get; set; }

    }
}
