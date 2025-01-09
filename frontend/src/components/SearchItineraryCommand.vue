<template>
    <v-card outlined>
        <v-card-title>
            SearchItinerary
        </v-card-title>

        <v-card-text>
            <Date label="SearchDate" v-model="value.searchDate" :editMode="editMode"/>
            <String label="Location" v-model="value.location" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="searchItinerary"
            >
                SearchItinerary
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
        name: 'SearchItineraryCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.searchDate = '2025-01-09';
            this.value.location = '';
        },
        watch: {
        },
        methods: {
            searchItinerary() {
                this.$emit('searchItinerary', this.value);
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

