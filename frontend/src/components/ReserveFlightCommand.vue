<template>
    <v-card outlined>
        <v-card-title>
            ReserveFlight
        </v-card-title>

        <v-card-text>
            <Date label="ReservationDate" v-model="value.reservationDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="reserveFlight"
            >
                ReserveFlight
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
        name: 'ReserveFlightCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.reservationDate = '2025-01-09';
        },
        watch: {
        },
        methods: {
            reserveFlight() {
                this.$emit('reserveFlight', this.value);
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

