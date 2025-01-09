
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import HotelAccommodationProviderHotelManager from "./components/listers/HotelAccommodationProviderHotelCards"
import HotelAccommodationProviderHotelDetail from "./components/listers/HotelAccommodationProviderHotelDetail"

import AirlineFlightManager from "./components/listers/AirlineFlightCards"
import AirlineFlightDetail from "./components/listers/AirlineFlightDetail"

import TransportationProviderTransportationManager from "./components/listers/TransportationProviderTransportationCards"
import TransportationProviderTransportationDetail from "./components/listers/TransportationProviderTransportationDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/hotelAccommodationProviders/hotels',
                name: 'HotelAccommodationProviderHotelManager',
                component: HotelAccommodationProviderHotelManager
            },
            {
                path: '/hotelAccommodationProviders/hotels/:id',
                name: 'HotelAccommodationProviderHotelDetail',
                component: HotelAccommodationProviderHotelDetail
            },

            {
                path: '/airlines/flights',
                name: 'AirlineFlightManager',
                component: AirlineFlightManager
            },
            {
                path: '/airlines/flights/:id',
                name: 'AirlineFlightDetail',
                component: AirlineFlightDetail
            },

            {
                path: '/transportationProviders/transportation',
                name: 'TransportationProviderTransportationManager',
                component: TransportationProviderTransportationManager
            },
            {
                path: '/transportationProviders/transportation/:id',
                name: 'TransportationProviderTransportationDetail',
                component: TransportationProviderTransportationDetail
            },




    ]
})
