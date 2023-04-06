package search.v1


//easyjson:json
type SearchRequest struct {
	HotelCode       string                 `json:"hotelCode,validate:required"`
}
