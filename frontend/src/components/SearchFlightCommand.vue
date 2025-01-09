<template>
    <v-card outlined>
        <v-card-title>
            SearchFlight
        </v-card-title>

        <v-card-text>
            <String label="Departure" v-model="value.departure" :editMode="editMode"/>
            <String label="Destination" v-model="value.destination" :editMode="editMode"/>
            <Date label="TravelDate" v-model="value.travelDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="searchFlight"
            >
                SearchFlight
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
        name: 'SearchFlightCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.departure = '';
            this.value.destination = '';
            this.value.travelDate = '2025-01-09';
        },
        watch: {
        },
        methods: {
            searchFlight() {
                this.$emit('searchFlight', this.value);
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

