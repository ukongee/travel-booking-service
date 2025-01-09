<template>
    <v-card outlined>
        <v-card-title>
            ReserveTransportation
        </v-card-title>

        <v-card-text>
            <Date label="ReservationDate" v-model="value.reservationDate" :editMode="editMode"/>
            <LocalTime offline label="ReservationTime" v-model="value.reservationTime" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="reserveTransportation"
            >
                ReserveTransportation
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ReserveTransportationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.reservationDate = '2025-01-09';
            this.value.reservationTime = {};
        },
        watch: {
        },
        methods: {
            reserveTransportation() {
                this.$emit('reserveTransportation', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

