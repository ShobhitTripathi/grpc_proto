package searchTest


//easyjson:json
type SearchRequest struct {
	HotelCode       string                 `json:"hotelCode,validate:required"`
}
